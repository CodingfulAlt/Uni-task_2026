package com.university.factory;

import com.university.model.EasyTask;
import com.university.model.FunTask;
import com.university.model.HardTask;
import com.university.model.Task;

public class ConcreteTaskFactory implements TaskFactory {

    @Override
    public Task createTask(StudentType type) {
        switch (type) {
            case PRODIGY:
                return new FunTask();
            case FITNESS_MANIAC:
                return new HardTask();
            case LUCKY:
                return new EasyTask();
            default:
                throw new IllegalArgumentException("Непознат тип студент: " + type);
        }
    }
}
