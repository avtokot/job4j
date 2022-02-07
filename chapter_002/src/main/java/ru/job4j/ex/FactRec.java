package ru.job4j.ex;

public class FactRec {
    public static void main(String[] args) {
        int result = calc(3);
        System.out.println(result);
    }

    public static int calc(int i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return calc(i - 1) * i;
        }
    }
}
