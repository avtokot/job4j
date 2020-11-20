package ru.job4j.tracker;

import java.util.ArrayList;

public class Item extends ArrayList<Item> {
    private String name;
    private String id;

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

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " : " + id;
    }
}
