package ru.job4j.collection;

import java.util.Comparator;

public class JobSortAscendByPriority implements Comparator<Job> {

    @Override
    public int compare(Job priority, Job anotherPriority) {
        return Integer.compare(priority.getPriority(), anotherPriority.getPriority());
    }
}
