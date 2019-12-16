package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try {


            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader

            Scanner sc = new Scanner(System.in);
            String fileName = sc.nextLine();

            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file); // поток, который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter

            String line;

            while(!(line = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(line+"\n");
            }
            bufferedWriter.write("exit");

           bufferedWriter.close(); // закрываем поток
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}