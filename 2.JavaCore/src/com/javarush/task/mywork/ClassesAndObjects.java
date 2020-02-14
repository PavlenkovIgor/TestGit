package com.javarush.task.mywork;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Oleg", 59);
        person1.speak();
        person1.sayHello();
        int year1 = person1.calculateYearsToRetirement();


        Person person2 = new Person();
        person2.name = "Igor";
        person2.age = 26;
        person2.speak();
        int year2 = person2.calculateYearsToRetirement();

        System.out.println(year1 +" "+year2);


    }
}
 class Person{
     String name;
    int age;

    void  setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement()
    {
        int years = 65 - age;
       // System.out.println("When will to retire? Through: " + years);
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, my name is " + name + ". I am have is " + age + " year old");
        }
    }
        void sayHello(){
            System.out.println("Test");
        }
    }


