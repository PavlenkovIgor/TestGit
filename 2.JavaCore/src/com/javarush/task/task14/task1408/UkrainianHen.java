package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth = 9;
    @Override
    public int getCountOfEggsPerMonth() {
        return this.getCountOfEggsPerMonth;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}