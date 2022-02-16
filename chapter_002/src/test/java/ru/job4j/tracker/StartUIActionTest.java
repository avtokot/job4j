package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StartUIActionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream printStream = System.out;

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void backOutput() {
        System.setOut(printStream);
    }

    @Test
    public void whenCheckOutputMenu() {
        Output output = new ConsoleOutput();
        StubInput input = new StubInput(new String[]{"0"});
        StubAction action = new StubAction();
        new StartUI(output).init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu")
                .add("0. Create new item")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }

    @Test
    public void whenShowAllAction() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Fix bug");
        tracker.add(item);
        ShowAllAction allItems = new ShowAllAction(output);
        allItems.execute(new StubInput(new String[]{}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getName() + " : " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }

    @Test
    public void whenFindByNameAction() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Fix bug");
        tracker.add(item);
        FindByNameAction findName = new FindByNameAction(output);
        findName.execute(new StubInput(new String[]{"Fix bug"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getName() + " : " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        StubInput input = new StubInput(
                new String[]{"7", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new ExitAction(out)
        };
        new StartUI(out).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                        "Menu." + ln
                                + "0. Exit" + ln
                                + "Wrong input, you can select: 0 .. 0" + ln
                                + "Menu." + ln
                                + "0. Exit" + ln
                                + "Exit program" + ln
                )
        );
    }
}
