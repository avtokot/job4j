package ru.job4j.collection;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class User implements Comparable<User> {

    private String name;
    private int age;

    @Override
    public String toString() {
        return name + " : " + age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(@NotNull User anotherUser) {
        int result;
        result = this.name.compareTo(anotherUser.name);
        if (result == 0) {
            result = this.age - anotherUser.age;
        }
        return result;
    }
}
