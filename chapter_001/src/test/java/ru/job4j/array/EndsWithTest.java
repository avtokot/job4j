package ru.job4j.array;

import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class EndsWithTest {
    @Test
    public void whenArrayEndWithThenTrue() {
        EndsWith endsWith = new EndsWith();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = endsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrayEndWithThenFalse() {
        EndsWith endsWith = new EndsWith();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'i'};
        boolean result = endsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
