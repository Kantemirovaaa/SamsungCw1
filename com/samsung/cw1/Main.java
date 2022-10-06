package com.samsung.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int nextInt = scanner.nextInt();
        if (nextInt > 5){
            System.out.println("nextInt > 5");
            System.out.println("!");
        } else {
            System.out.println("nextInt < 5");
            System.out.println("!");
        }*/
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b)
            if (a > c) System.out.println(a);
            else System.out.println(c);

        else if (b > c) System.out.println(b);
           else System.out.println();

        }
    }

