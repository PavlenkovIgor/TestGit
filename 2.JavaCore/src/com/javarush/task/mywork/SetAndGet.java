package com.javarush.task.mywork;

public class SetAndGet {
    public static void main(String[] args) {

        People people = new People();

        people.setName("");
        people.setAge(26);
        System.out.println(people.getName());
        System.out.println(people.getAge());
        people.speak();





    }
}
    class People {
    private String name;
    private   int age;

    public void setName(String username)
    {
     if (username.isEmpty())
        {
            System.out.println("Пустое имя");
        }  else {
        name = username;}

    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        age = userAge;
    }
    public int getAge()
    {
        return age;
    }



    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, my name is " + name + ". I am have is " + age + " year old");
        }
    }

    }





