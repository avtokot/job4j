package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        final int someNumbers = 5;
        final int someNumbersTwo = 3;
        int[] numbers = new int[someNumbers];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + someNumbersTwo;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
