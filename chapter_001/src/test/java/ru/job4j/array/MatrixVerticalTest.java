package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixVerticalTest {
    @Test
    public void whenVerticalTrue() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixVertical.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenVerticalFalse() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', 'X', ' '},
        };
        int column = 2;
        boolean result = MatrixVertical.monoVertical(input, column);
        Assert.assertFalse(result);
    }
}
