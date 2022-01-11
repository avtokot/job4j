package ru.job4j.array;

/**
 * ArrayChar.
 */
public class ArrayChar {
    /**
     * @param pref - the first two chars
     * @param word - the whole word
     * @return result
     */
   final boolean startWith(final char[] word, final char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
