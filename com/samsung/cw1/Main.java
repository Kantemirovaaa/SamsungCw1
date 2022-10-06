package com.samsung.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        if (nextInt > 5){
            System.out.println("nextInt > 5");
            System.out.println("!");
        } else {
            System.out.println("nextInt < 5");
            System.out.println("!");
        }
    }
}
