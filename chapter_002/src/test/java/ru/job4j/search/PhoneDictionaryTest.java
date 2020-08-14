package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindBySurname() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Kot", "Gillan", "1984", "Odessa"));
        ArrayList<Person> persons = phoneDictionary.find("Kot");
        assertThat(persons.get(0).getSurname(), is("Gillan"));
    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Kot", "Gillan", "1984", "Odessa"));
        ArrayList<Person> persons = phoneDictionary.find("1984");
        assertThat(persons.get(0).getAddress(), is("Odessa"));
    }
}
