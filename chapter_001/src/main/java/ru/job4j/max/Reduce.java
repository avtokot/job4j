package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] arr) {
        array = arr;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Reduce reduce = new Reduce();
        int[] array = {1, 2, 3};
        reduce.to(array);
        reduce.print();
    }
}
