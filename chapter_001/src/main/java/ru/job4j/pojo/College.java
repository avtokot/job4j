package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setOwner("Ian Gillan");
        student.setGroup("group 2");
        student.setDateReceipt(new Date());

        System.out.println(" A new student " + student.getOwner()
                + " enter "
                + student.getGroup()
                + student.getDateReceipt());
    }
}
