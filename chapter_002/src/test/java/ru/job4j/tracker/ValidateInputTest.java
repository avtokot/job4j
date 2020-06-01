package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ValidateInputTest {
    ByteArrayOutputStream in = new ByteArrayOutputStream();
    PrintStream out = System.out;

    @Before
    public void loadInput() {
        System.setOut(new PrintStream(in));
    }

    @After
    public void backOutput() {
        System.setOut(out);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"one", "1"}));
        input.askInt("Invalid");
        assertThat(in.toString(), is(String.format("Please enter validate data again%n")));
    }

    @Test
    public void whenNotInvalidInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"7", "5"}));
        input.askInt("Select : ", 7);
        assertThat(in.toString(), is(String.format("Please select key from menu%n")));
    }
}
