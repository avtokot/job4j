package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

import static java.awt.geom.Point2D.distance;

public class PointTest {
    @Test
    public void distanceAB() {
        double x1 = 0;
        double y1 = 0;
        double x2 = 2;
        double y2 = 0;
        double expected = 2.0;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceCD() {
        double x1 = 2;
        double y1 = 3;
        double x2 = 1;
        double y2 = 5;
        double expected = 2.24;
        double out = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}

