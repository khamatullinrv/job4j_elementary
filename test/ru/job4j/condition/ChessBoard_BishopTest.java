package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoard_BishopTest {

       @Test
        public void wayIs6() {
            int way = ChessBoard_Bishop.way(0, 0, 6, 6);
            assertThat(way, is(6));
        }

        @Test
        public void wayIs5() {
            int way = ChessBoard_Bishop.way(0, 0, 5, 5);
            assertThat(way, is(5));
        }

        @Test
        public void wayIs0() {
            int way = ChessBoard_Bishop.way(0, 0, 5, 6);
            assertThat(way, is(0));
        }
    }