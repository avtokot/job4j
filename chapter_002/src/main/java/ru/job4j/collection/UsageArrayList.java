package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kot");
        names.add("Gillan");
        names.add("Lord");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
