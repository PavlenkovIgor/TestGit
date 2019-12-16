package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    int getCountOfEggsPerMonth = 9;
    @Override
    public int getCountOfEggsPerMonth() {
        return this.getCountOfEggsPerMonth;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}


