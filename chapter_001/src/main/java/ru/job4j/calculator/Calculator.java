package ru.job4j.calculator;

/**
 * Class for arithmetic operations
 *
 * @author Constantine
 * @version 1
 * @since 17.01.2020
 */
public class Calculator {
    /**
     * Method main implements arithmetic operations
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }

    /**
     * Subtraction
     *
     * @param first  - first argument
     * @param second - second argument
     */
    private static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Multiply
     *
     * @param first  - first argument
     * @param second - second argument
     */
    private static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Divide
     *
     * @param first  - first argument
     * @param second - second argument
     */
    private static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Adding
     *
     * @param first  - first argument
     * @param second - second argument
     */
    private static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

}
