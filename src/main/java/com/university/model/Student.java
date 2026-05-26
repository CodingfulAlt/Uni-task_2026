package com.university.model;

import com.university.strategy.ArrivalStrategy;

public class Student {

    private final String name;

    private Task task;

    private final ArrivalStrategy arrivalStrategy;

    public Student(String name, Task task, ArrivalStrategy arrivalStrategy) {
        this.name = name;
        this.task = task;
        this.arrivalStrategy = arrivalStrategy;
    }

    public String arrive() {
        return arrivalStrategy.arrive(name);
    }

    public String usePowers() {
        return task.describe();
    }


    public String getName() {
        return name;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
