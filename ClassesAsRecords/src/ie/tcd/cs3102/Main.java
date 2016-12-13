package ie.tcd.cs3102;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main(String[] args) throws FileNotFoundException{
        readRecord("records.txt");
        process(customers);
    }

    private static void readRecord(String fromName) throws FileNotFoundException {
        File file = new File(fromName);
        Scanner in = new Scanner(file);
        in.useDelimiter("[\n,]");
        int line = 0;
        while (in.hasNextLine()) {
            line++;

            String inAddress = null, inName = null;
            int inSsn = -1;

            if (in.hasNext()) {
                inAddress = in.next().trim();
            }
            if (in.hasNext()) {
                inName = in.next().trim();
            }
            if (in.hasNext()) {
                String ssnString = in.next().trim();
                try {
                    inSsn = Integer.parseInt(ssnString);
                } catch (NumberFormatException e) {
                    System.err.println("Bad input at line " + line);
                }
            }
            in.nextLine();
            if (inAddress != null && inName != null && inSsn != -1) {
                boolean found = false;
                for (Customer c: customers) {
                    if (c.ssn == inSsn) {
                        found = true;
                        System.err.println("Duplicate record at line " + line);
                        break;
                    }
                }
                if (!found) {
                    Customer customer = new Customer(inAddress, inName, inSsn);
                    customers.add(customer);
                }
            }
        }
    }

    private static void process(ArrayList<Customer> customers) {

        for (Customer c: customers) {
            System.out.println(c.name);
        }
    }
}
