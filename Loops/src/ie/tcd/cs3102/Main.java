package ie.tcd.cs3102;

import java.util.Scanner;

public class Main {

    private final static double EPSILON = 1E-14;

    public static void main(String[] args) {

        // Rounding errors
        double r = Math.sqrt(2.0);

        if (r * r - 2.0 < EPSILON) {
            System.out.println("Equal");
        } else {
            System.out.println("Ooops " + r +  ", " + r * r);

        }

        double third = 1.0/3.0;

        System.out.println(3 * third);

        // While loops
        // 1. Initialise counter
        int n = 0;
        while (n < 10) { // 2. Condition test
            System.out.println(n);
            n++;    // 3. Change counter - Post-increment operator
        }

        // n == 10
        // System.out.println("n=" + n + " n++ + 1 =" + (n++ + 1));
        // n == 11

        // n == 10
        System.out.println("n=" + n + " ++n + 1 =" + (++n + 1));
        // n == 12

        // Do-while loop
        int myNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a number between 1 and 10: ");
            myNumber = scanner.nextInt();
        } while (myNumber < 1 || myNumber > 10);


        // For-loop
        String s = "Hello, welcome to this class in programming";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "-");
        }
        System.out.print("\n");

        // s.substring(firstIndex, lastIndex)
        String t = "class";


        for (int i = 0; i < s.length() - t.length(); i++) {
            String slice = s.substring(i, i+t.length());
            if ( slice.compareTo(t) == 0 ) {
                System.out.println("Found!");
            }
        }

        String a = "abc";
        String b = "abc";
        System.out.println(a.compareTo(b));

    }
}
