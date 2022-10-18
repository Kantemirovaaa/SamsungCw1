package com.samsung.cw1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int i;
        int count = 0;
        boolean flag = false;
        for (i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 == 0) {
                count += a[i];
                flag = true;
            }

        }
        if(flag){
            System.out.println(count);
        }else{
            System.out.println("NO");
        }
    }
}