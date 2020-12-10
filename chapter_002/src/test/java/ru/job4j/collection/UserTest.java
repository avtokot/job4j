package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        users.add(new User("Ivan", 33));
        Iterator<User> iterator = users.iterator();
        assertThat(iterator.next(), is(new User("Ivan", 31)));
        assertThat(iterator.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePetrVSIvan() {
        int result = new User("Petr", 32).compareTo(new User("Ivan", 31));
        assertThat(result, greaterThan(0));
    }
}
