package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5Numbers() {
        int[] arr = {2, 4, 1, 5, 3};
        int[] result = SortSelected.sort(arr);
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Numbers() {
        int[] arr = {4, 1, 9};
        int[] result = SortSelected.sort(arr);
        int[] expect = {1, 4, 9};
        assertThat(result, is(expect));
    }
}
