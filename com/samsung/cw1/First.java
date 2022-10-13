package com.samsung.cw1;


import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b =1;
        while(a >= 0){
            a = sc.nextInt();
            b += 1;
        }
        System.out.println(b);
    }
}