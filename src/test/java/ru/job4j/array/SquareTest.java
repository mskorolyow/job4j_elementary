package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {

    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound4Then0149() {
        int bound = 4;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9};
        assertThat(result).containsExactly(expected);
    }
}