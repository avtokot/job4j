package ru.job4j.ex;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenInputParameterCantLessZero() {
        int rsl = new Fact().calc(-1);
        MatcherAssert.assertThat(rsl, is(4));
    }
}
