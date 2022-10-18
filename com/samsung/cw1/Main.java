package com.samsung.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int res = sum(a,b);
        System.out.println(res);


    }
    public static int sum(int a, int b){
        int res = a + b;
        return res;
    }
}
