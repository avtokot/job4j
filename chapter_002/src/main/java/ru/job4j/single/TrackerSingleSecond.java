package ru.job4j.single;

import ru.job4j.tracker.Item;

public class TrackerSingleSecond {
    private static TrackerSingleSecond instance;

    public TrackerSingleSecond() {
    }

    public static TrackerSingleSecond getInstance() {
        if (instance == null) {
            instance = new TrackerSingleSecond();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleSecond trackerSingleSecond = TrackerSingleSecond.getInstance();
    }
}
