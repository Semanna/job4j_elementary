package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int expected = 2;

        int result = Max.max(first, second);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To4Then5() {
        int first = 5;
        int second = 4;
        int expected = 5;

        int result = Max.max(first, second);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To4Then4() {
        int first = 4;
        int second = 4;
        int expected = 4;

        int result = Max.max(first, second);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax12TFrom3() {
        int first = 4;
        int second = 12;
        int third = 5;
        int expected = 12;

        int result = Max.max(first, second, third);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10TFrom4() {
        int first = 4;
        int second = 8;
        int third = 5;
        int fourth = 10;
        int expected = 10;

        int result = Max.max(first, second, third, fourth);

        assertThat(result).isEqualTo(expected);
    }
}