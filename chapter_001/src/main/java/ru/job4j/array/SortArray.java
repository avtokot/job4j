package ru.job4j.array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] array) {
        int[] arr = new int[]{5, 3, 2, 1, 4};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
