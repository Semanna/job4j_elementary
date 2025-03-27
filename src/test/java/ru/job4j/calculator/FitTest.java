package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeight187ThenWeight100() {
        short height = 187;
        double expected = (187 - 100) * 1.15;
        double actual = Fit.calculateWeight(height, 100, 1.15);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void whenWomanHeight170ThenWeight69() {
        short height = 170;
        double expected = (170 - 110) * 1.15;
        double actual = Fit.calculateWeight(height, 110, 1.15);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void whenHeightIsZeroThenException() {
        short height = 0;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fit.calculateWeight(height, 100, 1.15);
        });
        assertEquals("Height must be positive", exception.getMessage());
    }

    @Test
    void whenHeightIsNegativeThenException() {
        short height = -170;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fit.calculateWeight(height, 100, 1.15);
        });
        assertEquals("Height must be positive", exception.getMessage());
    }
}
