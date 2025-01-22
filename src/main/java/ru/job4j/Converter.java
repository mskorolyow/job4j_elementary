package ru.job4j;

public class Converter {
    public static double rubleToEuro(double value) {
        return value / 90;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }
}
