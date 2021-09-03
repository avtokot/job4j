package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item implements Comparable<Item> {
    private String name;
    private String id;
    private final LocalDateTime created = LocalDateTime.now();

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return name + " : " + id;
    }


    @Override
    public int compareTo(Item anotherId) {
        return Long.valueOf(id).compareTo(Long.valueOf(anotherId.getId()));
    }
}
