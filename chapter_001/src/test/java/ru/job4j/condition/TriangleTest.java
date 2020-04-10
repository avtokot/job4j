package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenTriangleArea() {
        Point ab = new Point(3, 1);
        Point bc = new Point(2, 1);
        Point ac = new Point(2, 0);
        Triangle triangle = new Triangle(ab, bc, ac);
        double expected = 0.5;
        double result = triangle.area();
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void whenTriangleNoArea() {
        Point ab = new Point(2, 5);
        Point bc = new Point(2, 5);
        Point ac = new Point(1, 0);
        Triangle triangle = new Triangle(ab, bc, ac);
        double expected = -1;
        double result = triangle.area();
        Assert.assertEquals(result, expected, 0.01);
    }
}
