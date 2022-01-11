package ru.job4j.array;

/**
 * ArrayLoop.
 */

public class ArrayLoop {
    /**
     * @param args - someNumbers
     */
    public final void main(String[] args) {
        final int someNumbers = 5;
        int[] numbers = new int[someNumbers];
        final int someNumbersTwo = 3;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + someNumbersTwo;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
