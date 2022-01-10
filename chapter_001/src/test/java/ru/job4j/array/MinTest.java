package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class MinTest {
    @Test
    public void when3Min() {
        Min min = new Min();
        int[] arr = {4, 6, 3};
        int result = min.findMin(arr);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void when4Min() {
        Min min = new Min();
        int[] arr = {4, 7, 9};
        int result = min.findMin(arr);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void when2Min() {
        Min min = new Min();
        int[] arr = {6, 2, 9};
        int result = min.findMin(arr);
        int expect = 2;
        assertThat(result, is(expect));
    }
}
