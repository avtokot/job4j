package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива " + ages.length);
        String[] surname = new String[100500];
        System.out.println("Размер массива " + surname.length);
        float[] prices = new float[40];
        System.out.println("Размер массива " + prices.length);

        String[] names = new String[4];
        names[0] = "Kot";
        names[1] = "Glover";
        names[2] = "Gillan";
        names[3] = "Lord";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
