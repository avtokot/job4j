package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class SqMaxTest {
    @Test
    public void whenOfFourNumbersThanFindMax() {
        int result = SqMax.max(34, 3, 35, 55);
        assertThat(result, is(55));
    }
}
