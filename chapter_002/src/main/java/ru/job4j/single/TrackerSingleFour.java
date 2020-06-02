package ru.job4j.single;

import ru.job4j.tracker.Item;

public class TrackerSingleFour {
    public TrackerSingleFour() {
    }

    public static TrackerSingleFour getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static class Holder {
        private static final TrackerSingleFour INSTANCE = new TrackerSingleFour();
    }

    public static void main(String[] args) {
        TrackerSingleFour trackerSingleFour = TrackerSingleFour.getInstance();
    }
}
