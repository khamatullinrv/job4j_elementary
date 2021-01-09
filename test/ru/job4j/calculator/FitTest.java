package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short manheight = 170;
        double expected = 60;
        double rsl = Fit.manWeight(manheight);
        Assert.assertEquals(expected, rsl, 1.0 );
    }

    @Test
    public void womanWeight() {
        short womanheight = 160;
        double expected = 52;
        double rsl = Fit.womanWeight(womanheight);
        Assert.assertEquals(expected, rsl, 1);
    }
}