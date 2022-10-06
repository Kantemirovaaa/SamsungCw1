package com.samsung.cw1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println(x >= 3 & x <= 8 ? "true" : "false");
    }
}
