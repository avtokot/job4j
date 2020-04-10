package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax3() {
        int result = Max.max(2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax4() {
        int result = Max.max(3, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax5() {
        int result = Max.max(2, 3, 4, 5);
        assertThat(result, is(5));
    }
}
