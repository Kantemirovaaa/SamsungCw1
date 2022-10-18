package com.samsung.cw1;

import java.util.Scanner;

public class FIrst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; ++i)
            a[i] = scanner.nextInt();

        int X = scanner.nextInt();
        boolean flag = true;
        for(int i = 0; i < n; ++i) {
            if(a[i] == X) {
                flag = false;
                System.out.println(i + 1);
                break;
            }
        }
        if(flag)
            System.out.println("NO");

    }

}