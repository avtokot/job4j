package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixHorizontalTest {
    @Test
    public void whenHorizontalTrue() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixHorizontal.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHorizontalFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', 'X'},
        };
        int row = 1;
        boolean result = MatrixHorizontal.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }
}
