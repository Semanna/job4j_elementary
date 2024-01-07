package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;

        double output = RectangleArea.square(p, k);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP5K3Square1Dot17() {
        double expected = 1.17;
        int p = 5;
        double k = 3;

        double output = RectangleArea.square(p, k);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K3Square3() {
        int expected = 3;
        int p = 8;
        double k = 3;

        double output = RectangleArea.square(p, k);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP10K4Square4() {
        int expected = 4;
        int p = 10;
        double k = 4;

        double output = RectangleArea.square(p, k);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}