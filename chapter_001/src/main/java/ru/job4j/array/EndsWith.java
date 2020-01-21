package ru.job4j.array;

public class EndsWith {
    public boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = word.length - 1, j = post.length - 1; j >= 0; i--, j--) {
            if (word[i] == post[j]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
