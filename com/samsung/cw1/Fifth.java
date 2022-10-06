package com.samsung.cw1;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println((a == -b || a == -c || a == -d || b == -c || b == -d || c == -d)? "true":"false");
    }
}
