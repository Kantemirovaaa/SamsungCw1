package com.samsung.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int number = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                number = i + 1;
                System.out.println(number);
                break;
            }
        }
        if(number != -1){
            System.out.println(number);
        }else{
            System.out.println("NO");
        }


    }
}
