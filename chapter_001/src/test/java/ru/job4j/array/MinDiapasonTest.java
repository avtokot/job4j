package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinDiapasonTest {
    @Test
    public void whenFirstMinDiapason() {
        MinDiapason minDiapason = new MinDiapason();
        int[] arr = {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int result = minDiapason.findMin(arr, start, finish);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenLastMinDiapason() {
        MinDiapason minDiapason = new MinDiapason();
        int[] arr = {-1, 10, 5, 1};
        int start = 1;
        int finish = 3;
        int result = minDiapason.findMin(arr, start, finish);
        int expect = 1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenMiddleMinDiapason() {
        MinDiapason minDiapason = new MinDiapason();
        int[] arr = {1, 11, 5, 10};
        int start = 1;
        int finish = 3;
        int result = minDiapason.findMin(arr, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }
}
