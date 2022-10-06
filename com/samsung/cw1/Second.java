package com.samsung.cw1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        System.out.println(((x >= -3 & x <= 5) ^ (x >= 9 & x <= 15)) ? "true" : "false");
    }
}