package com.samsung.cw1;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sin;

public class Second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println((y <= 0.5 && x>= 0 && y <= sin(x) && x <= 3.14) && y >= 0 ? "YES" : "NO");


    }
}
