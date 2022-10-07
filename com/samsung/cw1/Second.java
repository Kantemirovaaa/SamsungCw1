package com.samsung.cw1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a < b && a < c) {
            System.out.print(a);
            if(b > c){
                System.out.print( " " + c);
                System.out.print(" " +b);

            } else{
                System.out.print(" " +b);
                System.out.print(" " +c);
            }
        }
        else if(b < a && b < c){
            System.out.print(b);
            if(a > c){
                System.out.print(" " +c);
                System.out.print(" " +a);
            } else{
                System.out.print(" " +a);
                System.out.print(" " +c);
            }


        }else if(c < a && c < b){
            System.out.print(c);
            if(a > b){
                System.out.print(" " +b);
                System.out.print(" " +a);
            } else{
                System.out.print(" " +a);
                System.out.print(" " +b);
            }
        }

    }
}
