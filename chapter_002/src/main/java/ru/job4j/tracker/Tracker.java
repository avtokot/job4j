package ru.job4j.tracker;

import java.util.*;

public class Tracker {
    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(generatedId());
        this.items.add(item);
        return item;
    }

    public String generatedId() {
        Random random = new Random();
        return String.valueOf(random.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> equalsName = new ArrayList<>();
        for (Item name : items) {
            if (name.getName().equals(key)) {
                equalsName.add(name);
            }
        }
        return equalsName;
    }

    public Item findById(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public Boolean deleteItem(String id) {
        boolean result = false;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                this.items.remove(item);
                result = true;
                break;
            }
        }
        return result;
    }

    public Boolean replaceItem(String id, Item anotherItem) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                anotherItem.setId(id);
                items.set(i, anotherItem);
                result = true;
                break;
            }
        }
        return result;
    }
}
