package ie.tcd.cs3102;

import java.util.Scanner;
import java.util.jar.Pack200;

public class Main {
    public enum FilingStatus {
        SINGLE,
        MARRIED,
        MARRIED_FILING_SEPARATELY
    };

    // Could have done it this way instead
    private static final int SINGLE = 0;
    private static final int MARRIED = 1;
    private static final int MARRIED_FILING_SEPARATELY = 1;



    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        long intNumber = scanner.nextLong();
        System.out.println("You entered: " + intNumber);

        System.out.print("Enter a real number: ");
        double realNumber = scanner.nextDouble();
        System.out.println("You entered: " + realNumber);

        System.out.print("Enter a real string: ");
        String aString = scanner.nextLine();
        System.out.println("You entered: " + aString);
        */


        long l = 0;
        double b = 3.14;

        /*
        if (l > 0) {
            // True case
            if (b > 0.0) {
                // True case
                System.out.println("It's true");
            } else {
                // False case for inner if (i.e b)
                l = 1;
            }
        } else {
            // False case
            System.out.println("It's false");
        }
        */
        // Ternary conditional expression

        int a = 1;

        // This is the
        double c = a == 1 ? 2.0 : 3.0;

        // same as this ...
        if (a == 1) {
            c = 2.0;
        } else {
            c = 3.0;
        }

        if (a >= 1 && c <= 3.0 && l == 0) {
            // True case for logical AND
        }

        if (a >= 1 || c < 3.0) {
            // True case for logical OR
        }

        if (a > 1 || c < 2.0 && l >= 0) {
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }

        if (a == 1) {
            // Done one thing
        } else if (a == 2) {
            // Do another thing
        } else if (a == 4) {
            // Do something else
        } else if (a == 8 ) {
            // etc, etc
        } else {
            // None of these...
        }

        switch(a) {
            case 1: // Done one thing
                break;
            case 2: // Do another thing
                break;
            case 4: // Do something else
                break;
            case 8: // etc, etc
                break;
            default:
                // None of these...
        }

        FilingStatus status = FilingStatus.MARRIED;

        switch(status) {
            case SINGLE:
                // Done stuff here
                break;
//            case MARRIED:
//                // Done other here
//                break;
            case MARRIED_FILING_SEPARATELY:
                // Done even other here
                break;
            default:
                // This can never happen
                break;
        }
    }
}
