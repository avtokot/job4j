package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class CheckPrimeNumberTest {
    @Test
    public void whenCheckPrimeNumberThanFifeTrue() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        boolean result = checkPrimeNumber.check(5);
        assertThat(result, is(true));
    }

    @Test
    public void whenCheckPrimeNumberThanFourNo() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        boolean result = checkPrimeNumber.check(4);
        assertThat(result, is(false));
    }

    @Test
    public void whenCheckPrimeNumberThanNineNo() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        boolean result = checkPrimeNumber.check(9);
        assertThat(result, is(false));
    }
}

