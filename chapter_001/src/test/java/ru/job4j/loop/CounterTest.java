package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CounterTest {
    @Test
    public void whenEvenNumbersSumThanFrom0neToTenEquallyThirty() {
        Counter counter = new Counter();
        int result = counter.add(0, 10);
        assertThat(result, is(30));
    }
}
