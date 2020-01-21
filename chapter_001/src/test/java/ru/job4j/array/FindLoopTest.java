package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Than1() {
        FindLoop findLoop = new FindLoop();
        int element = 5;
        int[] arr = {3, 5, 1, 9, 6};
        int result = findLoop.indexOf(arr, element);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayFind3() {
        FindLoop findLoop = new FindLoop();
        int el = 2;
        int start = 2;
        int finish = 4;
        int[] arr = {5, 2, 10, 2, 4};
        int result = findLoop.indexOf(arr, el, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayNotFoundElement() {
        int result = -1;
        int expect = -1;
        assertThat(result, is(expect));
    }
}
