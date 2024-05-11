package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Anna Semenova");
        student.setGroup("6012");
        student.setAdmissionDate(new Date());

        System.out.println("Student's name: "
                + student.getName() + " from group: " + student.getGroup()
                + " admitted to the University on " + student.getAdmissionDate());
    }
}
