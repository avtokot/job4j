package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(generatedId());
        this.items[position++] = item;
        return item;
    }

    public String generatedId() {
        Random random = new Random();
        return String.valueOf(random.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] equalsName = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < position; i++) {
            Item name = this.items[i];
            if (name.getName().equals(key)) {
                equalsName[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(equalsName, size);
    }

    public Item findById(String id) {
        for (int i = 0; i < position; i++) {
            Item item = this.items[i];
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public Boolean deleteItem(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            Item item = this.items[i];
            if (item.getId().equals(id)) {
                this.items[items.length - 1] = null;
                position--;
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                result = true;
                break;
            }
        }
        return result;
    }

    public Boolean replaceItem(String id, String name) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            Item item = this.items[i];
            if (item.getId().equals(id)) {
                item.setName(name);
                result = true;
            }
        }
        return result;
    }
}
