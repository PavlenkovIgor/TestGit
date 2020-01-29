package com.javarush.task.mywork;

import java.math.BigDecimal;

public class Variables {
    public static void main(String[] args) {
        short x = 556;
        long y = 9340890;

        double d = 222.22;
        float f = 111.11f;

        boolean b =true;
        char c = 'a';

        byte by = 100;


        BigDecimal z1 = BigDecimal.valueOf(22.2);
        BigDecimal z2 = BigDecimal.valueOf(33.3);
        BigDecimal z3 = BigDecimal.valueOf(44.4);

        BigDecimal dfe = z1.add(z3);


        System.out.println("d + f + e = " + dfe);


    }
}
