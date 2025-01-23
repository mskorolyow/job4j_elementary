package ru.job4j;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
class ConverterTest {
    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, Assertions.withPrecision(value));
    }
    @Test
    void whenConvert200RbThen3dot3333Euro() {
        float input = 180;
        float expected = 3;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, Assertions.withPrecision(value));
    }
}