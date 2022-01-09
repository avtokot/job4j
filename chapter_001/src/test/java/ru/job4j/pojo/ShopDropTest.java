package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class ShopDropTest {
    @Test
    public void whenDropFirst() {
        Book[] books = new Book[2];
        books[0] = new Book("Milk", 10);
        books[1] = new Book("Bread", 4);
        Book[] rsl = ShopDrop.delete(books, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Book[] books = new Book[2];
        books[0] = new Book("Milk", 10);
        books[1] = new Book("Bread", 4);
        Book[] rsl = ShopDrop.delete(books, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenArrayLengthIs4AndDeleteElementWithIndex1() {
        Book[] books = new Book[4];
        books[0] = new Book("Bread", 4);
        books[1] = new Book("Egg", 10);
        books[2] = new Book("Milk", 2);
        books[3] = new Book("Fish", 3);
        int index = 1;
        Book[] rsl = ShopDrop.delete(books, index);
        assertThat(rsl[index].getName(), is("Milk"));
        assertThat(rsl[2].getName(), is("Fish"));
        assertThat(rsl[books.length - 1], is(nullValue()));
    }

    @Test
    public void whenArrayLengthIs5AndDeleteElementWithIndex2() {
        Book[] books = new Book[5];
        books[0] = new Book("Bread", 4);
        books[1] = new Book("Egg", 10);
        books[2] = new Book("Milk", 2);
        books[3] = new Book("Fish", 3);
        books[4] = new Book("Fruit", 8);
        int index = 2;
        Book[] rsl = ShopDrop.delete(books, index);
        assertThat(rsl[1].getName(), is("Egg"));
        assertThat(rsl[index].getName(), is("Fish"));
        assertThat(rsl[3].getName(), is("Fruit"));
        assertThat(rsl[books.length - 1], is(nullValue()));
    }

}
