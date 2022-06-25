package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EqLastTest {
    @Test
    public void whenEqLastTrue() {
        int[] left = {1, 2, 3};
        int[] right = {2, 4, 3};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenEqLastFalse() {
        int[] left = {1, 2, 3};
        int[] right = {2, 4, 5};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}
