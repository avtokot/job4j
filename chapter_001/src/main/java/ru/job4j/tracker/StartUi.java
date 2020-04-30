package ru.job4j.tracker;

import java.util.Scanner;

public class StartUi {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select : ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 1) {
                StartUi.add(tracker, scanner);
            } else if (select == 2) {
                StartUi.showAllItems(tracker);
            } else if (select == 3) {
                StartUi.editItem(tracker, scanner);
            } else if (select == 4) {
                StartUi.delItem(tracker, scanner);
            } else if (select == 5) {
                StartUi.findId(tracker, scanner);
            } else if (select == 6) {
                StartUi.findName(tracker, scanner);
            } else if (select == 7) {
                System.out.println("==== Exit ====");
                run = false;
            }
        }
    }

    private static void editItem(Tracker tracker, Scanner scanner) {
        System.out.println("==== Edit item ====");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        if (tracker.replaceItem(id, name)) {
            System.out.println("Request completed");
        } else {
            System.out.println("Application not found");
        }
    }


    private static void delItem(Tracker tracker, Scanner scanner) {
        System.out.println("==== Delete item ====");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        if (tracker.deleteItem(id)) {
            System.out.println("Request completed");
        } else {
            System.out.println("Application not found");
        }
    }

    private static void add(Tracker tracker, Scanner scanner) {
        System.out.println("==== Create new item ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        tracker.add(item);
    }

    private static void findName(Tracker tracker, Scanner scanner) {
        System.out.println("==== Find item by name ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item[] names = tracker.findByName(name);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    private static void findId(Tracker tracker, Scanner scanner) {
        System.out.println("==== Find by id ====");
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        Item result = tracker.findById(id);
        System.out.println(result.getName());
    }

    private static void showAllItems(Tracker tracker) {
        System.out.println("==== Show all items ====");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    private void showMenu() {
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
        Tracker tracker = new Tracker();
        Scanner scanner = new Scanner(System.in);
        new StartUi().init(scanner, tracker);
    }
}
