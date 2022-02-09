package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUi {
    private final Output out;

    public StartUi(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select : ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    public void showMenu(UserAction[] actions) {
        out.println("Menu");
        for (int i = 0; i < actions.length; i++) {
            out.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        showDateAndTime();
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ShowAllAction(output),
                new EditAction(output),
                new DeleteAction(output),
                new FindIdAction(output),
                new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUi(output).init(validate, tracker, actions);
    }

    private static void showDateAndTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        Item item = new Item();
        System.out.println(item.getCreated().format(formatter));
    }
}
