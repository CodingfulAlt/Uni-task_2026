package com.university.strategy;

public class TeleportationStrategy implements ArrivalStrategy {

    @Override
    public String arrive(String studentName) {
        return studentName + " пристига чрез телепортация!";
    }
}
