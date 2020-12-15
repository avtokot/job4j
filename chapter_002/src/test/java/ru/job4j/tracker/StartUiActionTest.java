package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StartUiActionTest {

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
        StubInput input = new StubInput(new String[]{"0"});
        StubAction action = new StubAction();
        new StartUi().init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu")
                .add("0. Create new item")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }

    @Test
    public void whenShowAllAction() {
        Tracker tracker = new Tracker();
        Item item = new Item("Fix bug");
        tracker.add(item);
        ShowAllAction allItems = new ShowAllAction();
        allItems.execute(new StubInput(new String[]{}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getName() + " : " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }

    @Test
    public void whenFindByNameAction() {
        Tracker tracker = new Tracker();
        Item item = new Item("Fix bug");
        tracker.add(item);
        FindByNameAction findName = new FindByNameAction();
        findName.execute(new StubInput(new String[]{"Fix bug"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getName() + " : " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
    }
}
