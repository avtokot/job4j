package ru.job4j.array;

import java.util.Arrays;

public class Square {
    public int[] calculate(int bound) {
        int[] res = new int[bound];
        int k = 1;
        for (int i = 0; i < bound; i++) {
            res[i] = k * k;
            k = k + 1;
        }
        return res;
    }
}
