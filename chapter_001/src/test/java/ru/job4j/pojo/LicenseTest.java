package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LicenseTest {
    @Test
    public void whenEqualsTrue() {
        License first = new License();
        first.setCode("Audio");
        License second = new License();
        second.setCode("Audio");
        assertThat(first, is(second));
    }
}
