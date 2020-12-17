package ru.job4j.collection;

import java.util.Comparator;

public class JobSortDescByPriority implements Comparator<Job> {

    @Override
    public int compare(Job priority, Job anotherPriority) {
        return Integer.compare(anotherPriority.getPriority(), priority.getPriority());
    }
}
