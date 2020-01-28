package ru.job4j.array;


public class MinDiapason {
    public static int findMin(int[] arr, int start, int finish) {
        int min = arr[start];
        for (int i = start; i <= finish; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
