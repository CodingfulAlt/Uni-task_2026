package com.university.decorator;

import com.university.model.Task;

public class SpeedWritingDecorator extends AbstractSuperPowerDecorator {

    public SpeedWritingDecorator(Task task) {
        super(task);
    }

    @Override
    public String describe() {
        return super.describe() + " [Суперсила: Бързопис]";
    }
}
