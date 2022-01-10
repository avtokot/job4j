package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class CheckTest {
    @Test
    public void whenArrayIsFilledTrueThenTrue() {
        Check check = new Check();
        boolean[] arrTrue = {true, true, true};
        boolean result = check.mono(arrTrue);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrayIsFilledFalseAndTrueThenFalse() {
        Check check = new Check();
        boolean[] arrFalseAndTrue = {false, false, true};
        boolean result = check.mono(arrFalseAndTrue);
        assertThat(result, is(false));
    }

    @Test
    public void whenArrayIsFilledFalseThenTrue() {
        Check check = new Check();
        boolean[] arrTrue = {false, false, false};
        boolean result = check.mono(arrTrue);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrIsFilledAmountEvenTrueThenTrue() {
        Check check = new Check();
        boolean[] arrEven = {true, true, true, true};
        boolean result = check.mono(arrEven);
        assertThat(result, is(true));
    }

    @Test
    public void whenArrayIsFilledAmountEvenFalseAndTrueThenFalse() {
        Check check = new Check();
        boolean[] arrEven = {false, true, false, true};
        boolean result = check.mono(arrEven);
        assertThat(result, is(false));
    }
}
