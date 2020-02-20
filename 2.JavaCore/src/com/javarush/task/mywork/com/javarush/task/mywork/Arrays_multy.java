package com.javarush.task.mywork;

public class Arrays_multy {
    public static void main(String[] args) {
        int [][] matrice = {{1,2,3},
                            {11,22,33},
                            {111,222,333}};
        for (int i = 0; i < matrice.length; i++){
            for (int y = 0; y <matrice[i].length; y++){
                System.out.print(matrice[i][y] + " ");

            }
            System.out.println();
        }
    }
}
