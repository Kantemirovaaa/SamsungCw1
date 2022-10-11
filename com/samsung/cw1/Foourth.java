package com.samsung.cw1;

import java.util.Locale;
import java.util.Scanner;

public class Foourth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale(Locale.US);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();



        System.out.println(y > x * x - 2 && ((x < 0 && y < -x) || (x >= 0 && y < x)) ? "YES" : "NO");
    }

}