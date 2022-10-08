package com.samsung.cw1;

import java.util.Locale;
import java.util.Scanner;

public class Seventh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.println((x <= -1 && y >= 2) || (x >-1 && x <=0 && y >=1 && y < 2) || (x > 0 && x < 1 && y > 0 && y < 1) || (x == 1 && y ==0)? "YES":"NO");
    }
}
