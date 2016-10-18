package ie.tcd.cs3102;

public class Hello {

    /*
     Everything in here is a comment
     */
    public static void main(String[] args) {
        /*

           Primitive Types:

           byte - 8 bits (2^7 -> 2^7 - 1)
           char - character (16 bits)
           int  - 32 bits (-2^31 -> 2^31 - 1
           short - 16 bits (-2^15 -> 2^15 -1 )
           long  - 64 bits (-2^63 -> 2^62 -1 )
           float - 32 bits
           double - 64 bits
           boolean - true or false

         */
        byte b;
        byte b1;
        byte b2;

        b = -0x80; // -128

        char c = 'A';
        char formerC = c;
        c = 'B';

        long l = 221312383255325270L;

        double pi = 22.0/7;

        boolean trueOrFalse = (1 > 2);

        System.out.println("b=" + b + " c="  + c + " formerC=" + formerC);
        System.out.println("l=" + l +
            " max="  + (long)(Math.pow(2, 63)-1) +
            " min="  + (long)(-Math.pow(2, 63)));
        System.out.println("pi=" + pi);
        System.out.println("boolean=" + trueOrFalse);

        /*
         Strings
         */
        String s = "Hello, CS3102";
        String former = s;
        s = "A new string";

        System.out.println("s=" + s + " former=" + former);

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + ", " + s2;
        System.out.println("s1 + s2=" + s3);
        System.out.println("length(s3) = " + s3.length());
        System.out.println(s3.substring(2));
        System.out.println(s3.substring(2, 5));
        System.out.print("This is a newline \n");
        System.out.print("This is a tab \t\t ...");




    }
}
