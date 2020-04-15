package ru.job4j.pojo;

import com.sun.jdi.request.WatchpointRequest;

public class Library {
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

        System.out.println();

        System.out.println("Replace books");
        books[0] = cleanCode;
        books[2] = war;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCount());
        }

        System.out.println();

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
