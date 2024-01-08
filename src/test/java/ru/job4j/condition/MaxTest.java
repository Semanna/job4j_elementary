package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;

        int result = Max.max(left, right);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To4Then5() {
        int left = 5;
        int right = 4;
        int expected = 5;

        int result = Max.max(left, right);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int expected = 4;

        int result = Max.max(left, right);

        assertThat(result).isEqualTo(expected);
    }
}