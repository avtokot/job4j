package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] arr = {3, 5, 1, 7, 8};
        int[] result = SortSelected.sort(arr);
        int[] expect = {1, 3, 5, 7, 8};
        assertThat(result, is(expect));
    }
}
