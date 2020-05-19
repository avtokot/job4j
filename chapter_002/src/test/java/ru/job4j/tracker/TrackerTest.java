package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TrackerTest {
    @Test
    public void whenAddItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test");
        tracker.add(item);
        Item result = tracker.add(item);
        assertThat(result.getName(), is("test"));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test");
        tracker.add(item);
        Item[] result = tracker.findByName(item.getName());
        assertThat(result[0].getName(), is("test"));
    }

    @Test
    public void whenFindAllItems() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        tracker.add(item1);
        String result = tracker.findAll()[0].getName();
        assertThat(result, is(item1.getName()));
    }

    @Test
    public void whenFindItemsById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getId(), is(item.getId()));
    }

    @Test
    public void whenDeleteItemOne() {
        Tracker tracker = new Tracker();
        Item one = new Item("one");
        Item two = new Item("two");
        Item three = new Item("three");
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        Boolean result = tracker.deleteItem(one.getId());
        assertThat(result, is(true));
    }

    @Test
    public void whenDeleteItemTwo() {
        Tracker tracker = new Tracker();
        Item one = new Item("one");
        Item two = new Item("two");
        Item three = new Item("three");
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        Boolean result = tracker.deleteItem(two.getId());
        assertThat(result, is(true));
    }

    @Test
    public void whenDeleteItemThree() {
        Tracker tracker = new Tracker();
        Item one = new Item("one");
        Item two = new Item("two");
        Item three = new Item("three");
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        Boolean result = tracker.deleteItem(three.getId());
        assertThat(result, is(true));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item one = new Item("one");
        Item two = new Item("two");
        tracker.add(one);
        System.out.println("Before - " + one);
        Boolean result = tracker.replaceItem(one.getId(), two);
        assertThat(result, is(true));
        System.out.println("After - " + Arrays.toString(tracker.findAll()));
    }
}
