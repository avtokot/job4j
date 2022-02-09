package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item result = tracker.findById(id);
        if (result != null) {
            out.println(result.getName());
        } else {
            out.println("Item not found :(");
        }
        return true;
    }
}

