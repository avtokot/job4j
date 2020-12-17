package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SortJobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> jobComparator = new JobSortDescByName().thenComparing(new JobSortDescByPriority());
        int result = jobComparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bag", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorSortAscendByName() {
        Comparator<Job> jobComparator = new JobSortAscendByName();
        int result = jobComparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bag", 2)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenComparatorSortAscendByPriority() {
        Comparator<Job> jobComparator = new JobSortAscendByPriority();
        int result = jobComparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bag", 2)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorSortDescByName() {
        Comparator<Job> jobComparator = new JobSortAscendByName();
        int result = jobComparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bag", 2)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenComparatorSortDescByPriority() {
        Comparator<Job> jobComparator = new JobSortDescByPriority();
        int result = jobComparator.compare(
                new Job("Impl task", 0),
                new Job("Fix bag", 2)
        );
        assertThat(result, greaterThan(0));
    }
}
