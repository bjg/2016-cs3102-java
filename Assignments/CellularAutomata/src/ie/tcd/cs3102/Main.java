package ie.tcd.cs3102;

import java.util.ArrayList;

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
        return false;
    }

    /*
     * Print a representation of a row of cells to the screen. Use a '.' (dot)
     * character for cells which are active and a ' ' (space) character for
     * cells which are inactive
     */
    private static void printRow(ArrayList<Boolean> row) {
        // Provide your implementation here
    }

    /*
     * Return a random boolean state (true or false)
     */
    private static boolean randomState() {

        // Provide your implementation here
        return false;
    }

    /*
     * Return a randomly initialized row of cells
     */
    private static ArrayList<Boolean> randomRow() {

        // Provide your implementation here
        return null;
    }

    /*
     * Return a row of cells with only the centre cell active
     */
    private static ArrayList<Boolean> centeredRow() {

        // Provide your implementation here
        return null;
    }

    /*
     * Return the next row of cells based on the previous row according to the rule
     */
    private static ArrayList<Boolean> nextRow(ArrayList<Boolean> previousRow) {

        // Provide your implementation here
        return null;
    }
}
