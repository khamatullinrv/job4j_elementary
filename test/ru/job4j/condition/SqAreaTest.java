package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void ifP6andK2than2() {

        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out,0.01);
    }

    @Test
    public void if262144andK7then1879048192() {

        double expected = 1879048192;
        int p = 262144;
        int k = 7;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out,0.1);
    }


}