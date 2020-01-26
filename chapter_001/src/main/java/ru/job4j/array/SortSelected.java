package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            if (data[i] > min) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }
}
