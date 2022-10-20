package com.samsung.cw1;

import java.util.Scanner;
public class NumberDigits {
    public static int sumOfDigits(int n) {
        int count = 0;
        while(n > 0){
            count += n % 10;
            n = n /10;
        }

        return count;

    }
    public static int sumOfSeven(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0 && i > 9 && i < 100) {
                count += sumOfDigits(i);
            }

        }

        return count;
    }
    public static int sumOfThirteen(int n) {
        int count = 0;
        for (int i = 0; i < n ; i++) {
            if(i % 13 == 0){
                count += i;
            }
        }

        return count;
    }
    public static int binFraction(double x, int n) {
        int count = 0;
        for (int i = 0; i < n ; i++) {
            x = x * 2;
            System.out.print((int)x);
            x = x - (int)x;
        }

        return count;
    }

}