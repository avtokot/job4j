package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class MortgageTest {
    @Test
    public void whenTwoYear() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }

    @Test
    public void whenOneYear() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }
}
