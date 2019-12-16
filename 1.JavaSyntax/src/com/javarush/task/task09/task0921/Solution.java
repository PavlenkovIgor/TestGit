package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws IOException {
      try {

          InputStreamReader r=new InputStreamReader(System.in);
          BufferedReader reader = new BufferedReader(r);
          ArrayList<String> list = new ArrayList<>();
          while (reader.readLine() != null) {
              list.add(reader.readLine());
          }
          System.out.println(list);

      }
      catch (Exception e)
      {

      }
    }
}
