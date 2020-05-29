package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream in = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(in));
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"one", "1"}));
        input.askInt("Enter");
        assertThat(in.toString(), is(String.format("Please enter validate data again%n")));
        System.setOut(out);
    }
}
