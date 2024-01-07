package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short manHeight = 180;
        double expected = 92;

        double output = Fit.manWeight(manHeight);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short womanHeight = 170;
        double expected = 69;

        double output = Fit.womanWeight(womanHeight);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}