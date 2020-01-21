package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenArrayCharStartWithPrefixThenTrue() {
        ArrayChar arrayChar = new ArrayChar();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = arrayChar.startWith(word, pref);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayCharStartWithPrefixThenFalse() {
        ArrayChar arrayChar = new ArrayChar();
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = arrayChar.startWith(word, pref);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
