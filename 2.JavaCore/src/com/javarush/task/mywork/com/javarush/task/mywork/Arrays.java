package com.javarush.task.mywork;

public class Arrays {
    public static void main(String[] args) {

        char character = 'a';
        String s = "Hello";
        int [] numbers = new int [5];

//        System.out.println(x);
        for (int i = 0; i < numbers.length; i++){
            double x = Math.random()*12;
            int y = (int) x;
            numbers[i]= i*y;
    }
        for (int i = 0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
