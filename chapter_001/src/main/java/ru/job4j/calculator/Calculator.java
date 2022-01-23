package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int multiply(int y) {
        return x * y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        sum(5);
        multiply(6);
        minus(3);
        Calculator calculator = new Calculator();
        calculator.divide(2);
        calculator.sumAllOperation(4);
    }
}