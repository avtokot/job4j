package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class FactorialTest {
    @Test
    public void whenCalculateFactorialFiveThenOneHundredTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenFactorialZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }

    @Test
    public void whenFactorialOneThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(1);
        assertThat(result, is(1));
    }

    @Test
    public void whenFactorialFourThenTwentyFour() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(4);
        assertThat(result, is(24));
    }
}
