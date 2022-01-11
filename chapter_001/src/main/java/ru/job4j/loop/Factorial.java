package ru.job4j.loop;

/**
 * Factorial.
 */

public final class Factorial {
    /**
     * @param n - someNumber
     * @return result
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
