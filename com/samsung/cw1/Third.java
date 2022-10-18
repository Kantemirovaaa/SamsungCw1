package com.samsung.cw1;
import java.util.Locale;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        Locale us = Locale.US;
        int count = 0;
        int count2 =0;
        boolean flag = true;
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 != 0) {
                count += a[i];
                count2 += 1;
                flag = false;
            }

        }
        double cc = count / count2;
        if(flag){
            System.out.println("NO");
        }else{
            System.out.format(Locale.ENGLISH, "%.2f",cc);
        }

    }
}

