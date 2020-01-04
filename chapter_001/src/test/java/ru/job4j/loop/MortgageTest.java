package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


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
