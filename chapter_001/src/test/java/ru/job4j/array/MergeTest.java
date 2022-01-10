package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MergeTest {
    @Test
    public void whenFirstBigger() {
        int[] arrOne = {1, 2, 3};
        int[] arrTwo = {4, 5};
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(expect, is(Merge.merge(arrOne, arrTwo)));
    }

    @Test
    public void whenSecondBigger() {
        int[] arrOne = {2, 3};
        int[] arrTwo = {4, 5, 5};
        int[] expect = {2, 3, 4, 5, 5};
        assertThat(expect, is(Merge.merge(arrOne, arrTwo)));

    }

    @Test
    public void whenFirstEmpty() {
        int[] arrOne = {};
        int[] arrTwo = {4, 5, 5};
        int[] expect = {4, 5, 5};
        assertThat(expect, is(Merge.merge(arrOne, arrTwo)));

    }

    @Test
    public void whenSecondEmpty() {
        int[] arrOne = {1, 3, 4};
        int[] arrTwo = {};
        int[] expect = {1, 3, 4};
        assertThat(expect, is(Merge.merge(arrOne, arrTwo)));

    }
}
