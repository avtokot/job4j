package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class MatrixTest {
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(2);
        int[][] expect = {{1, 2}, {2, 4}};
        assertThat(result, is(expect));
    }
}
