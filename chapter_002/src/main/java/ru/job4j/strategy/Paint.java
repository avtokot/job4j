package ru.job4j.strategy;

public class Paint {
    public static void main(String[] args) {
        new Paint().draw(new Triangle());
    }

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}