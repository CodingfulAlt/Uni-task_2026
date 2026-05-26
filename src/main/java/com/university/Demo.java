package com.university;

import com.university.decorator.HyperFocusDecorator;
import com.university.decorator.SpeedWritingDecorator;
import com.university.decorator.TelepathyDecorator;
import com.university.factory.ConcreteTaskFactory;
import com.university.factory.StudentType;
import com.university.factory.TaskFactory;
import com.university.model.Student;
import com.university.model.Task;
import com.university.singleton.University;
import com.university.strategy.BusSleepingStrategy;
import com.university.strategy.RunningAndJumpingStrategy;
import com.university.strategy.TeleportationStrategy;

public class Demo {

    public static void main(String[] args) {

        University university = University.getInstance();
        University sameUniversity = University.getInstance();
        System.out.println("Един и същ университет: " + (university == sameUniversity));
        System.out.println();

        TaskFactory factory = new ConcreteTaskFactory();

        Task task1 = factory.createTask(StudentType.PRODIGY);
        task1 = new HyperFocusDecorator(task1);
        Student student1 = new Student("Иван (Вундеркинд)", task1, new RunningAndJumpingStrategy());

        Task task2 = factory.createTask(StudentType.FITNESS_MANIAC);
        task2 = new SpeedWritingDecorator(task2);
        Student student2 = new Student("Петър (Фитнес маниак)", task2, new TeleportationStrategy());


        Task task3 = factory.createTask(StudentType.LUCKY);
        task3 = new TelepathyDecorator(task3);
        Student student3 = new Student("Мария (Калитко)", task3, new BusSleepingStrategy());

        university.conductExam(student1);
        university.conductExam(student2);
        university.conductExam(student3);
    }
}
