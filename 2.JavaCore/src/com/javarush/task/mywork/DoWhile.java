package com.javarush.task.mywork;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        while (value != 5) {
            System.out.println("Введи 5");
            value = scanner.nextInt();
        }
        System.out.println("Ok");
    }
}