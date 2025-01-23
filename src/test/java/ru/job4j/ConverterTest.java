package ru.job4j;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 1.5555555f;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, Assertions.withPrecision(value));
    }

    @Test
    void whenConvert180RbThen3Euro() {
        float input = 180;
        float expected = 3;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, Assertions.withPrecision(value));
    }
}