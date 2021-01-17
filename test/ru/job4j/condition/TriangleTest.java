package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.NOTexist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenNOTExist() {
        boolean result = Triangle.NOTexist(2.0, 2.0, 3.0);
        assertThat(result, is(false));
    }
}