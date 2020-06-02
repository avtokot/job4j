package ru.job4j.single;

import ru.job4j.tracker.Item;

public enum TrackerSingleFirst {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleFirst trackerSingle = TrackerSingleFirst.INSTANCE;
    }
}
