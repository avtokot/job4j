package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class MultiMaxTest {
    @Test
    public void whenMaxNumberOfThreeNumbers() {
        MultiMax multiMax = new MultiMax();
        int result = multiMax.max(2, 6, 8);
        assertThat(result, is(8));
    }
}
