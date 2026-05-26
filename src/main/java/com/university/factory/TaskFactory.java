package com.university.factory;

import com.university.model.Task;


public interface TaskFactory {

    Task createTask(StudentType type);
}
