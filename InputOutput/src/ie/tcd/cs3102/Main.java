package ie.tcd.cs3102;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        File file = new File("numbers.txt");
        Scanner in = new Scanner(file);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            System.out.println("We read: " + num);
        }
        in.close();

        file = new File("strings.txt");
        in = new Scanner(file);
        in.useDelimiter("[\n,]");
        while (in.hasNext()) {
            String s = in.next();
            System.out.println("We read: " + s);
        }
        in.close();


        int count = copyFile("numbers.txt", "numbers_copy.txt");
        System.out.println("Copied " + count + " characters");
        count = appendFile("numbers.txt", "numbers_copy.txt");
        System.out.println("Appended " + count + " characters");

        readRecord("records.txt");
    }

    private static int copyFile(String fromName, String toName) throws FileNotFoundException {
        File file = new File(fromName);
        Scanner in = new Scanner(file);
        PrintWriter writer = new PrintWriter(toName);
        int count = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            writer.println(line);
            count += line.length();
        }
        in.close();
        writer.close();
        return count;
    }

    private static int appendFile(String fromName, String toName) throws IOException {
        File file = new File(fromName);
        Scanner in = new Scanner(file);
        PrintWriter writer = new PrintWriter(new FileWriter(toName, true));
        int count = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            writer.println(line);
            count += line.length();
        }
        in.close();
        writer.close();
        return count;
    }

    private static void readRecord(String fromName) throws FileNotFoundException {
        File file = new File(fromName);
        Scanner in = new Scanner(file);
        in.useDelimiter("[\n,]");
        int line = 0;
        while (in.hasNextLine()) {
            line++;
            String address = null, name = null;
            int ssn = -1;
            if (in.hasNext()) {
                address = in.next().trim();
            }
            if (in.hasNext()) {
                name = in.next().trim();
            }
            if (in.hasNext()) {
                String ssnString = in.next().trim();
                try {
                    ssn = Integer.parseInt(ssnString);
                } catch (NumberFormatException e) {
                    System.err.println("Bad input at line " + line);
                }
            }
            in.nextLine();
            if (address != null && name != null && ssn != -1) {
                System.out.print("Address: '" + address);
                System.out.print("' Name: '" + name);
                System.out.print("' SSN: '" + ssn);
                System.out.print("'\n");
            }
        }
    }
}
