package com.university.decorator;

import com.university.model.Task;

public abstract class AbstractSuperPowerDecorator implements Task {

    private final Task task;

    public AbstractSuperPowerDecorator(Task task) {
        this.task = task;
    }

    @Override
    public String describe() {
        return task.describe();
    }
}
