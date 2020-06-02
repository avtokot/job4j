package ru.job4j.single;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {
    @Test
    public void whenTrackerSingleFirstTrue() {
        TrackerSingleFirst trackerFirst = TrackerSingleFirst.INSTANCE;
        TrackerSingleFirst trackerSecond = TrackerSingleFirst.INSTANCE;
        Boolean result = trackerFirst.equals(trackerSecond);
        assertThat(result, is(true));
    }

    @Test
    public void whenTrackerSingleSecondTrue() {
        TrackerSingleSecond trackerFirst = TrackerSingleSecond.getInstance();
        TrackerSingleSecond trackerSecond = TrackerSingleSecond.getInstance();
        Boolean result = trackerFirst.equals(trackerSecond);
        assertThat(result, is(true));
    }

    @Test
    public void whenTrackerSingleThreeTrue() {
        TrackerSingleThree trackerFirst = TrackerSingleThree.getInstance();
        TrackerSingleThree trackerSecond = TrackerSingleThree.getInstance();
        Boolean result = trackerFirst.equals(trackerSecond);
        assertThat(result, is(true));
    }

    @Test
    public void whenTrackerSingleFourTrue() {
        TrackerSingleFour trackerFirst = TrackerSingleFour.getInstance();
        TrackerSingleFour trackerSecond = TrackerSingleFour.getInstance();
        Boolean result = trackerFirst.equals(trackerSecond);
        assertThat(result, is(true));
    }
}
