package com.samsung.cw1;

import java.util.Scanner;

public class Fourth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int b = -1 * scanner.nextInt();
        if(a == 0) {
            System.out.println(0 > b ? "any x" : "no such x");
        } else {
            double p = Math.round((double)(b) / a * 10.0) / 10.0;
            if(a > 0) {
                if(p < 0) {
                    System.out.println("any x");
                } else {
                    System.out.println("x<" + -1.0 * p + " or x>" + p);
                }
            } else {
                if(p <= 0) {
                    System.out.println("no such x");
                } else {
                    System.out.println(-1.0 * p + "<x<" + p);
                }
            }
        }

    }

}