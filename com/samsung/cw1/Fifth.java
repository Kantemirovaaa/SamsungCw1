package com.samsung.cw1;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, count;
        N = sc.nextInt();
        count =1;
        while(N > 1){
            N /= 2;
            count += 1;
        }
        System.out.println(count);

    }
}
