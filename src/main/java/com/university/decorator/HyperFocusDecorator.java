package com.university.decorator;

import com.university.model.Task;

public class HyperFocusDecorator extends AbstractSuperPowerDecorator {

    public HyperFocusDecorator(Task task) {
        super(task);
    }

    @Override
    public String describe() {
        return super.describe() + " [Суперсила: Свръхконцентрация]";
    }
}
