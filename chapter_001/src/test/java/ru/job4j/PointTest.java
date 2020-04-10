package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distanceAB() {
        Point ab = new Point(0, 0);
        Point bc = new Point(2, 0);
        double expected = 2.0;
        double out = ab.distance(bc);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceBC() {
        Point ab = new Point(2, 3);
        Point bc = new Point(1, 5);
        double expected = 2.23;
        double out = ab.distance(bc);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point ab = new Point(0, 0, 2);
        Point bc = new Point(0, 2, 3);
        double expected = 2.23;
        double out = ab.distance3d(bc);
        Assert.assertEquals(expected, out, 0.01);
    }
}

