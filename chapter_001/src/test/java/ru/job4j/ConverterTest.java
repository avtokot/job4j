package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expectedEuro = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expectedEuro, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 140;
        int expectedDollar = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expectedDollar, out);
    }

    @Test
    public void euroToRuble() {
        int in = 140;
        int expectedRub = 9800;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expectedRub, out);
    }

    @Test
    public void dollarToRuble() {
        int in = 140;
        int expectedRub = 8400;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expectedRub, out);
    }
}

