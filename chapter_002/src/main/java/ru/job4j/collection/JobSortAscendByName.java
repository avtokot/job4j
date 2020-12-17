package ru.job4j.collection;

import java.util.Comparator;

public class JobSortAscendByName implements Comparator<Job> {
    @Override
    public int compare(Job name, Job anotherName) {
        return name.getName().compareTo(anotherName.getName());
    }
}
