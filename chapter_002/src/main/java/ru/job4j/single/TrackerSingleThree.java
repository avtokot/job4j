package ru.job4j.single;

import ru.job4j.tracker.Item;

public class TrackerSingleThree {
    private static final TrackerSingleThree INSTANCE = new TrackerSingleThree();

    public TrackerSingleThree() {
    }

    public static TrackerSingleThree getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleThree trackerSingleThree = TrackerSingleThree.getInstance();
    }
}
