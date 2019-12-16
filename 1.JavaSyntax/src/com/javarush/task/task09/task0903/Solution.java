package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
//        int stackTraceElements = Thread.currentThread().getStackTrace()[2].getLineNumber();
//        System.out.println(stackTraceElements);
        return Thread.currentThread().getStackTrace()[2].getLineNumber();

    }

    public static int method2() {
        method3();
//        int stackTraceElements = Thread.currentThread().getStackTrace()[2].getLineNumber();
//        System.out.println(stackTraceElements);
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
//        int stackTraceElements = Thread.currentThread().getStackTrace()[2].getLineNumber();
//        System.out.println(stackTraceElements);
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
//        int stackTraceElements = Thread.currentThread().getStackTrace()[2].getLineNumber();
//        System.out.println(stackTraceElements);
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
//        int stackTraceElements = Thread.currentThread().getStackTrace()[2].getLineNumber();
//        System.out.println(stackTraceElements);
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
