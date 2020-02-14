package com.javarush.task.mywork;

public class Dog extends Animal{
    public  void bark(){
        System.out.println("I am barking");
    }
    public  void eat(){  //переопределение
        System.out.println("Dog is eating!");
    }
    public void showName(){

        System.out.println(name);
    }
}
