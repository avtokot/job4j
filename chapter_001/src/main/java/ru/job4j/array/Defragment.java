package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int j = i;
                while (j < array.length && array[i] == null) {
                    j++;
                    if (j < array.length) {
                        array[i] = array[j];
                        array[j] = null;
                    }
                }
            }
        }
        return array;
    }
}
