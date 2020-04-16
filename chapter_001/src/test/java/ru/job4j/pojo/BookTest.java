package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {
    @Test
    public void whenEqualsNameTrue() {
        Book first = new Book("Forest");
        Book second = new Book("Forest");
        assertThat(first, is(second));
    }
}
