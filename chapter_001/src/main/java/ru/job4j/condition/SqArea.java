package ru.job4j.condition;

public class SqArea {
    public static void main(String[] args) {
        double result = square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result);
    }

    public static double square(double p, double k) {
        double res = Math.pow(p, 2) * k;
        double res1 = 4 * Math.pow((k + 1), 2);
        return res / res1;
    }
}
