package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void whenCheckPrimeNumberIsYes() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        boolean result = checkPrimeNumber.check(5);
        assertThat(result, is(true));
    }

    @Test
    public void whenCheckPrimeNumberIsNow() {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        boolean result = checkPrimeNumber.check(4);
        assertThat(result, is(false));
    }
}
