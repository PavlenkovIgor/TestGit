package com.javarush.task.task14.task1408;

public abstract class Hen implements Country {
    public abstract int getCountOfEggsPerMonth();

    int getCountOfEggsPerMonth;
    String getDescription() {
        return "Я - курица.";
    }
}