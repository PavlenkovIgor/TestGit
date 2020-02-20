package com.javarush.task.mywork;

public class WordStatic {
    public static void main(String[] args) {
      Man1 m1 = new Man1("Igor",22);
      Man1 m2 = new Man1("Oleg",26);
      Man1.description = "Cool";
      m1.getAllFields();
      Man1.description = "Bad";
      m2.getAllFields();

      m1.printNumberOfPeople();
      m2.printNumberOfPeople();




    }
}
class Man1{
    private String name;
    private int age;
    public static String description;
    private  static  int countPeople;



    public Man1(String name, int age){
        System.out.println("Hello! I am the fourth constructor!");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name){this.name = name;}
    public  void  setAge(int age){this.age = age;}
    public  void  getAllFields(){
        System.out.println(name + "," + age+ "," +description);
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is: "+countPeople);
    }
}