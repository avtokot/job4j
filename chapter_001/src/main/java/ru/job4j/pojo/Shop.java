package ru.job4j.pojo;

public class Shop {
    public Book[] delete(Book[] books, int index) {
        books[index] = null;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book == null && i < books.length - 1) {
                books[i] = books[i + 1];
                books[i + 1] = null;
            }
        }
        return books;
    }

    public static void main(String[] args) {
        Book war = new Book("War", 1);
        Book honor = new Book("Honor", 2);
        Book cleanCode = new Book("Clean code", 3);

        Book[] books = new Book[3];
        books[0] = war;
        books[1] = honor;
        books[2] = cleanCode;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCount());
        }

        System.out.println("After delete book under index 2");
        Shop shop = new Shop();
        Book[] arr = shop.delete(books, 1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                Book book = arr[i];
                System.out.println(book.getName() + " - " + book.getCount());
            } else {
                System.out.println("null");
            }
        }
    }
}
