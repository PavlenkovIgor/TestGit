package com.javarush.task.mywork;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0 :
                System.out.println("oy");
                break;
            case 7 :
                System.out.println("ee");
                break;
            case 18 :
                System.out.println("bad");
                break;
            default:
                System.out.println("default");
        }

    }
}
