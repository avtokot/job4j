package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortNameAndIdTest {
    Tracker tracker;

    @Before
    public void setUp() {
        tracker = new Tracker();
        Item item1 = new Item("Baby");
        Item item2 = new Item("Cold");
        Item item3 = new Item("April");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);

        for (Item item : tracker.findAll()) {
            System.out.println(item.getName() + " : " + item.getId());
        }
    }

    @After
    public void setDown() {
        System.out.println("-------------------------");
        for (Item item : tracker.findAll()) {
            System.out.println(item.getName() + " : " + item.getId());
        }

    }

    @Test
    public void whenNameAscending() {

        Collections.sort(tracker.findAll(), new SortByNameAscending());
        assertThat(tracker.findAll().get(0).getName(), is("April"));
    }

    @Test
    public void whenNameDescending() {
        Collections.sort(tracker.findAll(), new SortByNameDescending());
        assertThat(tracker.findAll().get(0).getName(), is("Cold"));
    }

    @Test
    public void whenIdDescending() {
        Collections.sort(tracker.findAll(), Collections.reverseOrder());

        String item1 = tracker.findAll().get(0).getId();
        long a = Long.parseLong(item1);

        String item2 = tracker.findAll().get(1).getId();
        long b = Long.parseLong(item2);

        String item3 = tracker.findAll().get(2).getId();
        long c = Long.parseLong(item3);

        long max = Math.max(Math.max(a, b), c);
        assertThat(String.valueOf(max), is(item1));
    }

    @Test
    public void whenIdAscending() {
        Collections.sort(tracker.findAll());

        String item1 = tracker.findAll().get(0).getId();
        long a = Long.parseLong(item1);

        String item2 = tracker.findAll().get(1).getId();
        long b = Long.parseLong(item2);

        String item3 = tracker.findAll().get(2).getId();
        long c = Long.parseLong(item3);

        long min = Math.min(Math.min(a, b), c);
        assertThat(String.valueOf(min), is(item1));
    }
}
