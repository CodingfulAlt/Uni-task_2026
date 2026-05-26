package com.university.singleton;

import com.university.model.Student;

public class University {

    private static University instance;

    private final String name;

    private University() {
        this.name = "Свръх университет";
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }
    public void conductExam(Student student) {
        System.out.println("=== " + name + " ===");
        System.out.println(student.arrive());
        System.out.println(student.getName() + " получи задача: " + student.getTask().describe());
        System.out.println(student.getName() + " се справи успешно с: " + student.usePowers());
        System.out.println();
    }

    public String getName() {
        return name;
    }
}
