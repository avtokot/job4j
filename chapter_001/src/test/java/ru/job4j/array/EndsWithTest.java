package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.EndsWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {
    @Test
    public void whenArrayEndWithThenTrue() {
        EndsWith endsWith = new EndsWith();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = endsWith.endsWith(word, post);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayEndWithThenFalse() {
        EndsWith endsWith = new EndsWith();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'i'};
        boolean result = endsWith.endsWith(word, post);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
