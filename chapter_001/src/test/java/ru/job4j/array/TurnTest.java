package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Turn;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class TurnTest {
    @Test
    public void whenArrayTurnBack() {
        Turn turn = new Turn();
        int[] array = {1, 2, 3, 4};
        int[] result = turn.back(array);
        int[] expect = {4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddOfItems() {
        Turn turn = new Turn();
        int[] array = {1, 2, 3, 4, 5};
        int[] result = turn.back(array);
        int[] expect = {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}
