package ie.tcd.cs3102;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static final int ROW_WIDTH = 101;
    private static final int GENERATIONS = 30;

    /*
     * Create the first row of the cellular automaton and then
     * generate each next generation based on the state of the
     * previous generation's cells
     *
     * You will use the rule described here:
     *
     * https://www.wolframalpha.com/input/?i=rule+182
     *
     * Execute this process twice:
     * 1. Once using a randomly initialised first row to cells
     * 2. Once using a centered first row of cells
     */
    public static void main(String[] args) {
        // Provide your implementation here
        ArrayList<Boolean> row = randomRow();
        printRow(row);
        for (int n = 0; n < GENERATIONS; n++) {
            ArrayList<Boolean> nextRow = nextRow(row);
            printRow(nextRow);
            row = nextRow;
        }
    }
    /*
     * Given the previous states of the left, middle and right cells in the
     * previous generation, return the new state according to the rule provided
     *
     * See the following description for details:
     *
     * https://www.wolframalpha.com/input/?i=rule+182
     */
    private static boolean nextState(boolean left, boolean middle, boolean right) {

        // Provide your implementation here
        if        (left  && middle  && right) {
            return true;
        } else if (left  && middle  && !right) {
            return false;
        } else if (left  && !middle && right) {
            return true;
        } else if (left  && !middle && !right) {
            return true;
        } else if (!left && middle  && right) {
            return false;
        } else if (!left && middle  && !right) {
            return true;
        } else if (!left && !middle && right) {
            return true;
        } else /* if (!left && !middle && !right) */ {
            return false;
        }
    }

    private static void printState(boolean state) {
        System.out.print(state ? '.' : ' ');
    }

    /*
     * Print a representation of a row of cells to the screen. Use a '.' (dot)
     * character for cells which are active and a ' ' (space) character for
     * cells which are inactive
     */
    private static void printRow(ArrayList<Boolean> row) {
        // Provide your implementation here
        for (boolean state : row) {
            printState(state);
        }
        System.out.print('\n');
    }

    /*
     * Return a random boolean state (true or false)
     */
    private static boolean randomState() {

        // Provide your implementation here
        Random rand = new Random();
        int n = rand.nextInt(2);
        return n == 0 ? false : true;
    }

    /*
     * Return a randomly initialized row of cells
     */
    private static ArrayList<Boolean> randomRow() {

        // Provide your implementation here
        ArrayList<Boolean> row = new ArrayList<>();
        for (int i = 0; i < ROW_WIDTH; i++) {
            row.add(randomState());
        }
        return row;
    }

    /*
     * Return a row of cells with only the centre cell active
     */
    private static ArrayList<Boolean> centeredRow() {

        // Provide your implementation here
        ArrayList<Boolean> row = new ArrayList<>();
        int centre = ROW_WIDTH / 2;
        for (int i = 0; i < centre; i++) {
            row.add(i, false);
        }
        row.add(centre, true);
        for (int i = centre + 1; i < ROW_WIDTH; i++) {
            row.add(i, false);
        }
        return row;
    }

    /*
     * Return the next row of cells based on the previous row according to the rule
     */
    private static ArrayList<Boolean> nextRow(ArrayList<Boolean> previousRow) {

        // Provide your implementation here
        ArrayList<Boolean> nextRow = new ArrayList<>(ROW_WIDTH);
        for (int i = 0; i < ROW_WIDTH; i++) {
            boolean left, right;
            if (i == 0) {
                left = previousRow.get(ROW_WIDTH - 1);
                right = previousRow.get(i + 1);
            } else if (i == ROW_WIDTH - 1) {
                left = previousRow.get(i - 1);
                right = previousRow.get(0);
            } else {
                left = previousRow.get(i - 1);
                right = previousRow.get(i + 1);
            }
            boolean middle = previousRow.get(i);
            boolean state = nextState(left, middle, right);
            nextRow.add(state);
        }
        return nextRow;
    }
}

