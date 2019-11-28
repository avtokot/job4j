package ru.job4j.condition;

public class TrgArea {
    public static void main(String[] args) {
        double result = area(2, 2, 2);
        System.out.println("Area of triangle (2, 2, 2) = " + result);
    }

    private static double area(double a, double b, int c) {
        double perimeter = (a + b + c) / 2;
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }
}
