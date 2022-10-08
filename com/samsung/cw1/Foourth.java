package com.samsung.cw1;

import java.util.Locale;
import java.util.Scanner;

public class Foourth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.println(x * x - 2 < 0 && (x >= y && -x>= y) ? "YES":"NO");
    }
}
