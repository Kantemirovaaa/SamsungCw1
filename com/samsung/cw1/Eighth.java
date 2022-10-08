package com.samsung.cw1;

import java.util.Locale;
import java.util.Scanner;

public class Eighth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.println(x > 0 && y < 1 && ((y < 0 && x * x + y * y < 1) || (y > 0 && y > x -1))? "YES":"NO");
    }
}
