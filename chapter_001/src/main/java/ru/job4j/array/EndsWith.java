package ru.job4j.array;

/**
 * The word ends
 */
public class EndsWith {
    /**
     * @param word - the word infection
     * @param post - the last char
     * @return result
     */
    public final boolean endsWith(final char[] word, final char[] post) {
        boolean result = true;
        for (int i = word.length - 1, j = post.length - 1; j >= 0; i--, j--) {
            if (word[i] != post[j]) {
                result = false;
                break;
            }

        }
        return result;
    }
}
