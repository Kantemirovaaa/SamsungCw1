package com.samsung.cw1;
import java.util.Locale;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.println(x * x + y * y < 1 && ((x < 0) || (x > 0 & y >x)) ? "YES":"NO");
    }
}
