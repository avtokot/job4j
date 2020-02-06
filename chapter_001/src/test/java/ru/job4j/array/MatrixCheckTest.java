package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenMatrixCheckTrueThenFalse() {
        char[][] input = {
                {' ', 'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '}
        };
//        boolean result = MatrixCheck.isWin(input);
//        assertThat(result, is(false));
    }

    @Test
    public void whenMatrixCheckTrueThenTrue() {
        char[][] input = {
                {' ', 'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '}
        };
//        boolean result = MatrixCheck.isWin(input);
//        assertThat(result, is(true));
    }

    @Test
    public void whenDataMonoTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
//        boolean result = MatrixCheck.isWin(input);
//        assertThat(result, is(true));
    }

    @Test
    public void whenMonoVerticalTrue() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenMonoVerticalFalse() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoHorizontalTrue() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontalFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(false));
    }

    @Test
    public void whenDiagonalTrue() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] result = MatrixCheck.diagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }
    @Test
    public void whenDiagonalFalse() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        char[] result = MatrixCheck.diagonal(input);
        char[] expect = {'X', ' ', 'X'};
        assertThat(result, is(expect));
    }
}
