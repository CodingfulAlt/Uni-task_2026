package com.university.strategy;

public class RunningAndJumpingStrategy implements ArrivalStrategy {

    @Override
    public String arrive(String studentName) {
        return studentName + " пристига с тичане и подскачане!";
    }
}
