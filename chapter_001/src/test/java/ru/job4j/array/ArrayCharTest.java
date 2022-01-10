package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class ArrayCharTest {
    @Test
    public void whenArrayCharStartWithPrefixThenTrue() {
        ArrayChar arrayChar = new ArrayChar();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = arrayChar.startWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrayCharStartWithPrefixThenFalse() {
        ArrayChar arrayChar = new ArrayChar();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = arrayChar.startWith(word, pref);
        assertThat(result, is(false));
    }
}
