package ru.job4j.collection;

import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare stringCompare = new StringCompare();
        int result = stringCompare.compare(
                "Ivanov",
                "Ivanov");
        assertThat(result, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldByNegative() {
        StringCompare stringCompare = new StringCompare();
        int result = stringCompare.compare(
                "Ivanov",
                "Ivanova");
        assertThat(result, lessThan(0));
    }

    @Test

    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }
}
