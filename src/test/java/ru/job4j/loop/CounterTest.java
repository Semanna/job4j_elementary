package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void start15MoreThanFinish8Result0() {
        int start = 15;
        int finish = 8;
        int expected = 0;

        int result = Counter.sum(start, finish);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void start2Finish10Result54() {
        int start = 2;
        int finish = 10;
        int expected = 54;

        int result = Counter.sum(start, finish);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void start1Finish1Result1() {
        int start = 1;
        int finish = 1;
        int expected = 1;

        int result = Counter.sum(start, finish);

        assertThat(result).isEqualTo(expected);
    }
}