package ru.job4j.tracker;


public class StartUi {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select : ");
            if (select == 1) {
                StartUi.add(input, tracker);
            } else if (select == 2) {
                StartUi.showAllItems(tracker);
            } else if (select == 3) {
                StartUi.editItem(input, tracker);
            } else if (select == 4) {
                StartUi.delItem(input, tracker);
            } else if (select == 5) {
                StartUi.findId(input, tracker);
            } else if (select == 6) {
                StartUi.findName(input, tracker);
            } else if (select == 7) {
                System.out.println("==== Exit ====");
                run = false;
            }
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("==== Edit item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter new name: ");
        if (tracker.replaceItem(id, name)) {
            System.out.println("Request completed");
        } else {
            System.out.println("Application not found");
        }
    }


    public static void delItem(Input input, Tracker tracker) {
        System.out.println("==== Delete item ====");
        String id = input.askStr("Enter id: ");
        if (tracker.deleteItem(id)) {
            System.out.println("Request completed");
        } else {
            System.out.println("Application not found");
        }
    }

    public static void add(Input input, Tracker tracker) {
        System.out.println("==== Create new item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findName(Input input, Tracker tracker) {
        System.out.println("==== Find item by name ====");
        String name = input.askStr("Enter name: ");
        Item[] names = tracker.findByName(name);
        if (names.length != 0) {
            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }
        } else {
            System.out.println("Sorry, item not found :(");
        }

    }

    public static void findId(Input input, Tracker tracker) {
        System.out.println("==== Find by id ====");
        String id = input.askStr("Enter id: ");
        Item result = tracker.findById(id);
        if (result != null) {
            System.out.println(result.getName());
        } else {
            System.out.println("Item not found :(");
        }
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("==== Show all items ====");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Add new item");
        System.out.println("2. Show all items");
        System.out.println("3. Edit item");
        System.out.println("4. Delete item");
        System.out.println("5. Find item by id");
        System.out.println("6. Find item by name");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUi().init(input, tracker);
    }
}
