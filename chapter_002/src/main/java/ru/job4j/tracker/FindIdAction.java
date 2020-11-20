package ru.job4j.tracker;

public class FindIdAction implements UserAction {

    @Override
    public String name() {
        return "Find by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println(result.getName());
        } else {
            System.out.println("Item not found :(");
        }
        return true;
    }
}

