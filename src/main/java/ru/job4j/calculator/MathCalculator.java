package ru.job4j.calculator;

import ru.job4j.math.*;
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {

        return MathFunction.sum(first,second) + MathFunction.multiply(first,second);
    }

    public static double sumDiffAndDiv(double first, double second) {

        return MathFunction.difference(first, second) + MathFunction.division(first,second);
    }

    public static double totalSum(double first, double second) {

        return MathFunction.sum(first, second) + MathFunction.difference(first, second) + MathFunction.multiply(first, second) + MathFunction.division(first, second);
    }



    public static void main(String[] args) {

        System.out.println("Результат расчета равен: " + sumAndMultiply(10,20) );
    }



}
