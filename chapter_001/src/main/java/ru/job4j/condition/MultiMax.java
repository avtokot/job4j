package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = 0;
        if (first > second && first > third) {
            result = first;
        } else if (second > first && second > third) {
            result = second;
        } else if (third > first && third > second) {
            result = third;
        }
        return result;
    }
}
