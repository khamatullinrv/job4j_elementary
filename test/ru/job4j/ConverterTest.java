package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int input = 140;
        int expected = 2;
        int rsl = Converter.rubleToEuro(input);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenConvert70RblThen1Euro() {
        int input = 70;
        int expected = 1;
        int rsl = Converter.rubleToEuro(input);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenConvert210RblThen3Euro() {
        int input = 210;
        int expected = 3;
        int rsl = Converter.rubleToEuro(input);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        int input = 180;
        int expected =3;
        int rsl = Converter.rubleToDollar(input);
        Assert.assertEquals(expected, rsl);
    }
}