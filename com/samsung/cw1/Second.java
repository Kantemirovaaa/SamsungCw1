package com.samsung.cw1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        b = 0;
        a = sc.nextInt();
        if(a > 10){
            b += a;
        }
        while(a % 5 != 0){
            a = sc.nextInt();
            if(a > 10){
                b += a;
            }
        }
        System.out.println(b);
    }
}
