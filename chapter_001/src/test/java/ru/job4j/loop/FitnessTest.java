package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class FitnessTest {
    @Test
    public void whenIvanLessBySmallNic() {
        Fitness fitness = new Fitness();
        int result = fitness.calc(50, 90);
        assertThat(result, is(2));
    }

    @Test
    public void whenIvanLessByNic() {
        Fitness fitness = new Fitness();
        int result = fitness.calc(90, 95);
        assertThat(result, is(1));
    }

    @Test
    public void whenIvanGreatNic() {
        Fitness fitness = new Fitness();
        int result = fitness.calc(95, 90);
        assertThat(result, is(0));
    }
}
