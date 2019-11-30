package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenTriangleExist() {
        boolean result = Triangle.exist(2, 2, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenTriangleNoExist() {
        boolean result = Triangle.exist(1, 1, 2);
        assertThat(result, is(false));
    }
}
