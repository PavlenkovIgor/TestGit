package com.javarush.task.mywork;

public class LessonsAboutLine {
    public static void main(String[] args) {

            String x = "hello";
            x=x.toUpperCase();
        System.out.println(x);

        String string1 = "Hello";
        String string2 = " my";
        String string3 = " dear";
        String string4 = string1+string2+string3;
        System.out.println(string4);

        StringBuilder sb = new StringBuilder("Hai");
        System.out.println(sb.toString());
        sb.append(" my").append(" enemy");
        System.out.println(sb.toString());







            Man2 m1 = new Man2("Igor",22);
            Man2 m2 = new Man2("Oleg",26);
            Man2.description = "Cool";
            m1.getAllFields();
            Man2.description = "Bad";
            m2.getAllFields();

            m1.printNumberOfPeople();
            m2.printNumberOfPeople();




        }
    }
    class Man2{
        private String name;
        private int age;
        public static String description;
        private  static  int countPeople;



        public Man2(String name, int age){
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
