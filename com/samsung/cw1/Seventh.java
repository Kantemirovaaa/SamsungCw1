package com.samsung.cw1;

import java.util.Locale;
import java.util.Scanner;

public class Seventh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println((x <= 1) && (y >= 1 - x) && (x > 0 || y >= 2 * x * x) ? "YES" : "NO");
    }

}