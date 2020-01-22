package ru.job4j.array;

public class ArrayChar {
    public boolean startWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < pref.length; i++) {
            result = word[i] == pref[i] ? true : false;
        }
        return result;
    }
}
