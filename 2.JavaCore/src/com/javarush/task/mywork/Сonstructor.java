package com.javarush.task.mywork;

public class Сonstructor {
    public static void main(String[] args) {
        Man man1 = new Man("Bob",22);


    }
}
     class Man{
         private String name;
         private int age;

         public Man(){
             System.out.println("Hello! I am the first constructor!");
         }
         public Man(String name){
             this.name = name;
         }
         public Man(int age){
             this.age = age;
         }
         public Man(String name, int age){
             System.out.println("Hello! I am the fourth constructor!");
             this.name = name;
             this.age = age;
         }

         public void setName(String name){this.name = name;}
         public  void  setAge(int age){this.age = age;}
    }

