package com.samsung.cw1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        X = sc.nextInt();
        if(X >= 0 && X < 9) {
            System.out.println("DIGIT");
        }

        else if(X >= 10 && X <= 99){
            System.out.println("NUM");


        }else {
            System.out.println("OTHER");
        }

    }
}
