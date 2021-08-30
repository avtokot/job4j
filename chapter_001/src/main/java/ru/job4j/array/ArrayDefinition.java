package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива " + ages.length);
        String[] surname = new String[100500];
        System.out.println("Размер массива " + surname.length);
        float[] prices = new float[40];
        System.out.println("Размер массива " + prices.length);
    }
}
