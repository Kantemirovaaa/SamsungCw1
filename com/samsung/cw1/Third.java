package com.samsung.cw1;

import java.util.Locale;
import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println( y <= 2 - x * x && ((x >= 0 && y >= 0) || (x <= 0 && y >=x ))? "YES" : "NO");

    }
}
