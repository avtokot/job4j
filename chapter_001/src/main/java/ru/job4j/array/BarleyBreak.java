package ru.job4j.array;

/**
 * BarleyBreak.
 */
public class BarleyBreak {

    /**
     * @param args - someNumbers
     */
    public static void main(final String[] args) {

        final int rowArray = 3;
        final int colArray = 3;
        int[][] arr = new int[rowArray][colArray];
        int k = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = k;
                k++;
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
