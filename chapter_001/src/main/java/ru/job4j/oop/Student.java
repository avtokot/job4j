package ru.job4j.oop;

public class Student {
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.sound();
        petya.sound();
    }

    public void music() {
        System.out.println("Tra - tra - tra");
    }
    public void sound() {
        System.out.println("I believe i can fly");
    }
}
