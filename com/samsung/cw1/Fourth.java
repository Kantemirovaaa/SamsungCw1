package com.samsung.cw1;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b, count1, count2;
        a = sc.nextInt();
        b = sc.nextInt();
        count1 =0;
        count2 = a % b;
        while(a >= b){
            a -= b;
            count1 += 1;

        }
        System.out.print(count1 + " " + count2);
    }
}

