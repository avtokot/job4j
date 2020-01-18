package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Than149() {
        Square square = new Square();
        int bound = 3;
        int[] result = square.calculate(bound);
        int[] expect = {1, 4, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenBound5Than1491625() {
        Square square = new Square();
        int bound = 5;
        int[] expect = square.calculate(bound);
        int[] result = {1, 4, 9, 16, 25};
        assertThat(expect, is(result));
    }

    @Test
    public void whenBound7Than14916253649() {
        Square square = new Square();
        int bound = 7;
        int[] expect = square.calculate(bound);
        int[] result = {1, 4, 9, 16, 25, 36, 49};
        assertThat(expect, is(result));
    }
}
