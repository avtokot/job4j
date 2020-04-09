package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ab, Point bc, Point ac) {
        this.first = ab;
        this.second = bc;
        this.third = ac;
    }

    /**
     * The method calculate perimeter of a triangle
     *
     * @param a distance between points AB
     * @param b distance between points BC
     * @param c distance between points AC
     * @return perimeter
     */
    public double perimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Method calculate area triangle
     *
     * @return result
     */
    public double area() {
        double result = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = perimeter(a, b, c);
        if (exist(a, b, c)) {
            Math.sqrt(p * (p - a) * (p - b) * (p - c));
            result = -1;
        }
        return result;
    }

    /**
     * The method checks is possible to build triangle
     *
     * @param a distance between points AB
     * @param b distance between points BC
     * @param c distance between points AC
     * @return result
     */
    public static boolean exist(double a, double b, double c) {
        return ((a + b) > c && (b + c) > a && (c + a) > b);
    }
}
