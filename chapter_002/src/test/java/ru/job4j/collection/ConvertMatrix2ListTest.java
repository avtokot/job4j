package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConvertMatrix2ListTest {
    @Test
    public void whenConvertMatrixTo2List() {
        ConvertMatrix2List convert = new ConvertMatrix2List();
        int[][] array = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = convert.toList(array);
        assertThat(result, is(expect));
    }
}
