package ru.job4j.array;

public class EndsWith {
    public boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = word.length - 1, j = post.length - 1; j >= 0; i--, j--) {
            result = word[i] == post[j] ? true : false;
            break;
        }
        return result;
    }
}
