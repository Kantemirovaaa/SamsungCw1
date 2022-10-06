package com.samsung.cw1;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        System.out.println((x >= 100 && x <= 999 && (x % 5 == 0)) ? "true" : "false" );
    }
}
