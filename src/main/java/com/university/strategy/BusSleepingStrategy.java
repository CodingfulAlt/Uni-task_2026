package com.university.strategy;

public class BusSleepingStrategy implements ArrivalStrategy {

    @Override
    public String arrive(String studentName) {
        return studentName + " пристига след спане в автобус!";
    }
}
