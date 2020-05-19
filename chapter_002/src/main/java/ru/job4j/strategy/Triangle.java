package ru.job4j.strategy;

import java.util.StringJoiner;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringJoiner stringJoiner = new StringJoiner(System.lineSeparator());
        stringJoiner.add("+");
        stringJoiner.add("++");
        stringJoiner.add("+++");
        stringJoiner.add("++++");
        return stringJoiner.toString();
    }
}
