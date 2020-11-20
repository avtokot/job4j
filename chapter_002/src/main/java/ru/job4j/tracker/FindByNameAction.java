package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {

    @Override
    public String name() {
        return "Find item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> names = tracker.findByName(name);
        if (names.size() != 0) {
            for (Item item : names) {
                System.out.println(item);
            }
        } else {
            System.out.println("Sorry, item not found :(");
        }
        return true;
    }
}
