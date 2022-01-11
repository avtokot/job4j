package ru.job4j.pojo;

/**
 * ShopDrop.
 */
public class ShopDrop {
    public static Book[] delete(Book[] books, int index) {
        for (int i = index; i < books.length - 1; i++) {
            books[i] = books[i + 1];
        }
        books[books.length - 1] = null;
        return books;
    }
}
