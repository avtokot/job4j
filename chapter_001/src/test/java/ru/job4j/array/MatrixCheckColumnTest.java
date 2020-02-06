package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckColumnTest {
    @Test
    public void whenMonoVerticalTrue() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean result = MatrixCheckColumn.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenMonoVerticalFalse() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        boolean result = MatrixCheckColumn.monoVertical(input, 2);
        assertThat(result, is(false));
    }
}
