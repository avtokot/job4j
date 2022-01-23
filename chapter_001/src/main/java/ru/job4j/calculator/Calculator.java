package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(x, a) + multiply(x, a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        sum(x, 5);
        multiply(x, 6);
        minus(3);
        Calculator calculator = new Calculator();
        calculator.divide(2);
        calculator.sumAllOperation(4);
    }
}