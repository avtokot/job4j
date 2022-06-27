package ru.job4j.array;

import java.util.Arrays;

public class RollBackArray {
    public static int[] rollBack(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int lastIndex = array[array.length - i - 1];
            newArr[i] = lastIndex;
        }
        return newArr;
    }
}
