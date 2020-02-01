package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
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
