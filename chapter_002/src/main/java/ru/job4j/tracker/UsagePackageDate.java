package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Date now " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("Date time " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time " + localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String currentDateTime = localDateTime.format(formatter);
        System.out.println("After format " + currentDateTime);
    }
}
