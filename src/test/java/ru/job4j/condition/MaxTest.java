package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMaxHaveOneVariables() {
        Max max = new Max();
        int expected = 20;
        int output = max.max(10, 20);
        assertEquals(expected, output);

    }

    @Test
    void whenMaxHaveTwoVariables() {
        Max max = new Max();
        int expected = 8;
        int output = max.max(3, 5, 8);
        assertEquals(expected, output);
    }

    @Test
    void whenMaxHaveThreeVariables() {
        Max max = new Max();
        int expected = 8;
        int output = max.max(3, 5, 8, 7);
        assertEquals(expected, output);
    }
}