package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class TriangleTest {
    @Test
    public void whenTriangleDraw() {
        assertThat(new Triangle().draw(), is(new StringJoiner(System.lineSeparator())
                .add("+")
                .add("++")
                .add("+++")
                .add("++++")
                .toString()));
    }
}
