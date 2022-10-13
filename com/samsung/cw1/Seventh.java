package com.samsung.cw1;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, c;
        N = sc.nextInt();
        c = 1;
        while (N >= 10){
            N = N /10;
            c += 1;
        }
        System.out.println(c);
    }
}
