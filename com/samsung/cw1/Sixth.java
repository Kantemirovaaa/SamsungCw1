package com.samsung.cw1;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, x, c;
        N = sc.nextInt();
        c = 0;
        x = 25;
        while (x < N) {
            if (x % 2 == 0) {

                c += x;
            }
            x ++;
        }
        System.out.println(c);
    }
}
