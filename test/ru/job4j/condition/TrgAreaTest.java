// /*
package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrgAreaTest {

    @Test
    public void TrgAreaTest101012_48() {
        int expected = 48;
        int a = 10;
        int b = 10;
        int c = 12;
        double out = TrgArea.area(a, b, c );
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void TrgAreaTest151524_108() {
        int expected = 108;
        int a = 15;
        int b = 15;
        int c = 24;
        double out = TrgArea.area(a, b, c );
        Assert.assertEquals(expected, out, 0.01);
    }
}
//*/