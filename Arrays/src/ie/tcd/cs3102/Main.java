package ie.tcd.cs3102;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
            Native Array type in Java - not used very much any more
         */
        long n = 10;

        long someNumber; // default initial value is 0

        long[] arr = new long[3];

        arr[0] = 5; // Write to the array

        long l = arr[0];

        // Looping over an array to read its values using an index
        for (int i = 0; i < arr.length; i++) {
            long value = arr[i];
            System.out.println(value);
        }

        // Looping over an array to read its values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5 * i;
        }

        // Looping over an array to read its values using
        // "foreach" syntax
        for (long value: arr) {
            System.out.println(value);
        }

        /*
             ArrayList is more flexible because:

             1. You don't need to specify an initial size
             2. It expands automatically as you add items
         */

        /*
           You specify the type using the corresponding class name:

           long    -> Long
           double  -> Double
           boolean -> Boolean
           String  -> String (String is already a class

         */
        ArrayList<Long> arrList = new ArrayList<Long>();

        arrList.add(0, 100L); // Specifing a index
        arrList.add(1, 200L);
        arrList.add(300L);    // Append to the end


        // Looping over an array list to read its values using an index
        for (int i = 0; i < arrList.size(); i++) {
            long value = arrList.get(i); // get() instead of []
            System.out.println(value);
        }

        // Looping over an array list to write its values
        for (int i = 0; i < 5; i++) {
            arrList.add(i, 5L * i);      // add() instead of []
        }

        // Looping over an array list to read its values using
        // "foreach" syntax
        for (long value: arrList) {
            System.out.println(value);
        }

    }

    /*
        Resizing can make a new array that is smaller, the same size
        or bigger than the original

        Given:

        arr: (length == 8)
        +-----------------------+
        |  |  |  |  |  |  |  |  |
        +-----------------------+

        Example 1: resize(arr, 16)

        newArr: (length == 16)
        +-----------------------------------------------+
        |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
        +-----------------------------------------------+


        Example 2: resize(arr, 4)

        newArr: (length == 4)
        +-----------+
        |  |  |  |  |
        +-----------+

     */

    private static long[] resize(long[] arr, int newSize) {
        long[] newArr = new long[newSize];

        int len = newSize < arr.length ? newSize : arr.length;

        // Copy the values from the original array in the
        // corresponding index positions
        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

}
