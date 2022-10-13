package com.samsung.cw1;

import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        b = 0;
        a = sc.nextInt();
        while(a >= 10 && a <= 99){
            b += a % 10 + a /10;
            a = sc.nextInt();

        }
        System.out.println(b);
    }
}
