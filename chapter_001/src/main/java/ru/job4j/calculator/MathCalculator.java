package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiple(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return dif(first, second) + div(first, second);
    }

    public static double sumDivMultiplyDifSum(double first, double second) {
        return dif(first, second) + div(first, second)
                + sum(first, second) + multiple(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен " + sumAndMultiply(10, 20));
    }
}
