package com.samsung.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte aByte = -128;
        short aShort = 30000;
        int aInt = 2000000000;
        long aLong = 20000000000L;
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aInt);
        System.out.println(aLong);
        double  aDouble = 8.3434343443;
        System.out.println(aDouble);
        Scanner in = new Scanner(System.in);
        aDouble = in.nextDouble();
        System.out.println(aDouble);


    }
}
