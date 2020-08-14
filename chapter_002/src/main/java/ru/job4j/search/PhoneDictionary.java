package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Return list of all users, which contain the key in all fields
     *
     * @param key Key search
     * @return list of users
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().contains(key)) result = persons;
            if (persons.get(i).getSurname().contains(key)) result = persons;
            if (persons.get(i).getAddress().contains(key)) result = persons;
            if (persons.get(i).getPhone().contains(key)) result = persons;
        }
        return result;
    }
}
