package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumStart15MoreThanFinish8Result0() {
        int start = 15;
        int finish = 8;
        int expected = 0;

        int result = Counter.sum(start, finish);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumStart2Finish10Result54() {
        int start = 2;
        int finish = 10;
        int expected = 54;

        int result = Counter.sum(start, finish);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumStart1Finish1Result1() {
        int start = 1;
        int finish = 1;
        int expected = 1;

        int result = Counter.sum(start, finish);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersStart1Finish10Result30() {
        int start = 1;
        int finish = 10;
        int expected = 30;

        int result = Counter.sumByEven(start, finish);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersStart2Finish20Result110() {
        int start = 2;
        int finish = 20;
        int expected = 110;

        int result = Counter.sumByEven(start, finish);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersStartMinus20Finish2ResultMinus80() {
        int start = -20;
        int finish = 10;
        int expected = -80;

        int result = Counter.sumByEven(start, finish);

        assertThat(result).isEqualTo(expected);
    }
}