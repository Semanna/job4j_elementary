package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;

        double result = new Point(x1, y1).distance(new Point(x2, y2));

        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void when52To102Then5() {
        double expected = 5;
        int x1 = 5;
        int y1 = 2;
        int x2 = 10;
        int y2 = 2;

        double result = new Point(x1, y1).distance(new Point(x2, y2));

        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void whenMinus22To102Then12() {
        double expected = 12;
        int x1 = -2;
        int y1 = 2;
        int x2 = 10;
        int y2 = 2;

        double result = new Point(x1, y1).distance(new Point(x2, y2));

        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void when12To34Then2Dot82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;

        double result = new Point(x1, y1).distance(new Point(x2, y2));

        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void when30To98Then10() {
        double expected = 10;
        int x1 = 3;
        int y1 = 0;
        int x2 = 9;
        int y2 = 8;

        double result = new Point(x1, y1).distance(new Point(x2, y2));

        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void when308To004Then5() {
        Point first = new Point(3, 0, 8);
        Point second = new Point(0, 0, 4);
        double expected = 5;
        double result = first.distance3d(second);

        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }

    @Test
    void when305To001Then5() {
        Point first = new Point(3, 0, 5);
        Point second = new Point(0, 0, 1);
        double expected = 5;
        double result = first.distance3d(second);

        assertThat(expected).isEqualTo(result, withPrecision(0.01));
    }
}