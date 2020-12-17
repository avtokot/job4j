package ru.job4j.collection;

public class Job {
    private String name;
    private int priority;

    @Override
    public String toString() {
        return name + " : " + priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}
