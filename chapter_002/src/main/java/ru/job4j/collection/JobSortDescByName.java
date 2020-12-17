package ru.job4j.collection;

import java.util.Comparator;

public class JobSortDescByName implements Comparator<Job> {

    @Override
    public int compare(Job name, Job anotherName) {
        return anotherName.getName().compareTo(name.getName());
    }
}
