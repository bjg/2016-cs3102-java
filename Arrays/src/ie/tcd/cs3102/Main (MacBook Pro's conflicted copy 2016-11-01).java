package ie.tcd.cs3102;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long n = 10;

        long someNumber;

        long[] arr = new long[3];

        arr[0] = 5; // Write to the array

        long l = arr[0];

        System.out.println(l);

        // Looping over an array to read its values
        for (int i = 0; i < arr.length; i++) {
            long value = arr[i];
            System.out.println(value);
        }

        // Looping over an array to read its values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5 * i;
        }

        // Looping over an array to read its values
        for (long value: arr) {
            System.out.println(value);
        }

        ArrayList<Long> arr2 = new ArrayList<Long>();

        arr2.add(0, 100L);
        arr2.add(1, 200L);
        arr2.add(300L);


        // Looping over an array list to read its values
        for (int i = 0; i < arr2.size(); i++) {
            long value = arr2.get(i);
            System.out.println(value);
        }

        // Looping over an array list to write its values
        for (int i = 0; i < 5; i++) {
            arr2.add(i, 5L * i);
        }

        // Looping over an array list to read its values
        for (long value: arr2) {
            System.out.println(value);
        }

    }

    /*
        arr: (length == 8)
        +-----------------------+
        |  |  |  |  |  |  |  |  |
        +-----------------------+

        resize(arr, 16)

        newArr: (length == 16)
        +-----------------------------------------------+
        |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
        +-----------------------------------------------+


        resize(arr, 4)

        newArr: (length == 4)
        +-----------+
        |  |  |  |  |
        +-----------+

     */

    private static long[] resize(long[] arr, int newSize) {
        long[] newArr = new long[newSize];

        int len = newSize < arr.length ? newSize : arr.length;

        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

}
