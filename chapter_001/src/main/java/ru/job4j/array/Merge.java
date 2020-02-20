package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] right, int[] left) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < right.length) {
            result[index] = right[i];
            index++;
            i++;
        }
        while (j < left.length) {
            result[index] = left[j];
            index++;
            j++;
        }
        return result;
    }
}