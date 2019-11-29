package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class DummyBotTest {
    @Test
    public void whenBotSayGreet() {
        assertThat(DummyBot.answer("Привет, Бот."), is("Привет, умник."));
    }

    @Test
    public void whenBotSayBye() {
        assertThat(DummyBot.answer("Пока"), is("До скорой встречи."));
    }

    @Test
    public void whenBotUnknownQuestion() {
        assertThat(DummyBot.answer("Бла-бла-бла!"), is("Это ставит меня в тупик, задайте другой вопрос."));
    }
}
