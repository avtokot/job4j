package ru.job4j.condition;

import org.w3c.dom.ls.LSOutput;

public class Point {
    public static void main(String[] args) {
        double ab = distance(0, 0, 2, 0);
        double cd = distance(2, 3, 1, 5);
        System.out.println("Result (0, 0) to (2, 0) - " + ab);
        System.out.println("Result (2, 3) to (1, 5) - " + cd);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}
