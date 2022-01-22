package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int minus(int a) {
        return a - x;
    }

    private int divide(int a) {
        return a / x;
    }

    private int sumAllOperation() {
        return sum(4, 5) + multiply(3, 6) + minus(3) + divide(2);
    }

    public static void main(String[] args) {
        sum(4, 5);
        multiply(3, 6);
        minus(3);
        Calculator calculator = new Calculator();
        calculator.divide(2);
        calculator.sumAllOperation();
    }
}