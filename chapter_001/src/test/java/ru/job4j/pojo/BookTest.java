package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BookTest {
    @Test
    public void whenEqualsNameTrue() {
        Book first = new Book("Forest");
        Book second = new Book("Forest");
        assertThat(first, is(second));
    }
}
