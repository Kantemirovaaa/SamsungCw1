package com.samsung.cw1;

import java.util.Locale;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        sc.useLocale(Locale.US);
        x = sc.nextDouble();
        y = sc.nextDouble();
        System.out.println(x < 2 && y < x && x * x + y * y > 4 && y > 0 ? "YES" : "NO");

    }

}
