package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenArrayIsFilledTrueThenTrue() {
        Check check = new Check();
        boolean[] arrTrue = {true, true, true};
        boolean result = check.mono(arrTrue);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayIsFilledFalseAndTrueThenFalse() {
        Check check = new Check();
        boolean[] arrFalseAndTrue = {false, false, true};
        boolean result = check.mono(arrFalseAndTrue);
        boolean expect = false;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayIsFilledFalseThenTrue() {
        Check check = new Check();
        boolean[] arrTrue = {false, false, false};
        boolean result = check.mono(arrTrue);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrIsFilledAmountEvenTrueThenTrue() {
        Check check = new Check();
        boolean[] arrEven = {true, true, true, true};
        boolean result = check.mono(arrEven);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayIsFilledAmountEvenFalseAndTrueThenFalse() {
        Check check = new Check();
        boolean[] arrEven = {false, true, false, true};
        boolean result = check.mono(arrEven);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
