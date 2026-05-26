package com.university.decorator;

import com.university.model.Task;

public class TelepathyDecorator extends AbstractSuperPowerDecorator {

    public TelepathyDecorator(Task task) {
        super(task);
    }

    @Override
    public String describe() {
        return super.describe() + " [Суперсила: Телепатия]";
    }
}
