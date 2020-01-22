package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            result = data[0] == data[i] ? true : false;
        }
        return result;
    }
}
