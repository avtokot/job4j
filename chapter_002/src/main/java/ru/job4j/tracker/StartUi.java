package ru.job4j.tracker;


public class StartUi {
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select : ");
            if (select == 6) {
                System.out.println("Exit");
                run = false;
            } else {
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            }
        }
    }

    public static class EditAction implements UserAction {

        @Override
        public String name() {
            return "Edit item";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            String id = input.askStr("Enter id: ");
            String name = input.askStr("Enter new name: ");
            Item item = new Item(name);
            if (tracker.replaceItem(id, item)) {
                System.out.println("Request completed");
            } else {
                System.out.println("Application not found");
            }
            return true;
        }
    }


    public static class DeleteAction implements UserAction {

        @Override
        public String name() {
            return "Delete item";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            String id = input.askStr("Enter id: ");
            if (tracker.deleteItem(id)) {
                System.out.println("Request completed");
            } else {
                System.out.println("Application not found");
            }
            return true;
        }
    }

    public static class CreateAction implements UserAction {

        @Override
        public String name() {
            return "Create new item";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            String name = input.askStr("Enter name: ");
            Item item = new Item(name);
            tracker.add(item);
            return true;
        }
    }


    public static class FindByNameAction implements UserAction {

        @Override
        public String name() {
            return "Find item by name";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            String name = input.askStr("Enter name: ");
            Item[] names = tracker.findByName(name);
            if (names.length != 0) {
                for (int i = 0; i < names.length; i++) {
                    System.out.println(names[i]);
                }
            } else {
                System.out.println("Sorry, item not found :(");
            }
            return true;
        }
    }


    public static class FindIdAction implements UserAction {

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

    public static class ShowAllAction implements UserAction {

        @Override
        public String name() {
            return "Show all items";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            Item[] items = tracker.findAll();
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }
            return true;
        }
    }

    public void showMenu(UserAction[] actions) {
        System.out.println("Menu");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new EditAction(),
                new DeleteAction(),
                new FindIdAction(),
                new FindByNameAction()
        };
        new StartUi().init(input, tracker, actions);
    }
}
