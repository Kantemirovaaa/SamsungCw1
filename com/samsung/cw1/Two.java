package com.samsung.cw1;

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x, y, z;

        if(b > 31 || a < 1 || a > 12 || b < 1) {
            System.out.println(-1);

        }else {
                if (a == 1) {
                    x = 0;
                } else if (a == 2) {
                    x = 31;
                } else if (a == 3) {
                    x = 59;
                } else if (a == 4) {
                    x = 90;
                } else if (a == 5) {
                    x = 120;
                } else if (a == 6) {
                    x = 151;
                } else if (a == 7) {
                    x = 181;
                } else if (a == 8) {
                    x = 212;
                } else if (a == 9) {
                    x = 243;
                } else if (a == 10) {
                    x = 273;
                } else if (a == 11) {
                    x = 304;
                } else if (a == 12) {
                    x = 334;
                }
                y = x + b;
                z = 365 - y;
                System.out.println(z);


        }




    }
}
