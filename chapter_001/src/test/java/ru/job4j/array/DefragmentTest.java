package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class DefragmentTest {
    @Test
    public void whenFirstNull() {
        String[] arr = {null, "You", "I", null, null, "Was"};
        String[] result = Defragment.compress(arr);
        String[] expect = {"You", "I", "Was", null, null, null};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFirstNotNull() {
        String[] arr = {"You", "I", null, null, "Was"};
        String[] result = Defragment.compress(arr);
        String[] expect = {"You", "I", "Was", null, null};
        assertThat(result, is(expect));

    }
}
