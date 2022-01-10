package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class MinDiapasonTest {
    @Test
    public void whenFirstMinDiapason() {
        int[] arr = {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(arr, start, finish);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenLastMinDiapason() {
        int[] arr = {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(arr, start, finish);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenMiddleMinDiapason() {
        int[] arr = {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int result = MinDiapason.findMin(arr, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }
}
