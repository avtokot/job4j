package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {
    @Test
    public void square() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
 