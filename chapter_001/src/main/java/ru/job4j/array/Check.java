package ru.job4j.array;

/**
 * Check.
 */

public class Check {
    /**
     * @param data - someNumbers
     * @return result
     */
    public final boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
