package com.samsung.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean aBool = true;
        //>, <, ==, !=, >=, <=
        //boolean aBoolean = true;
        /*System.out.println(!aBoolean);
        aBoolean = 5 > 6;
        System.out.println(aBoolean);*/
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a > b ? a : b);
        //aBool = 0 < n && n < 10;*/
        //System.out.println(aBool);
        // ||- исключающее ИЛИ
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String res = ( ( y > 0) && ( x * x + y * y > 4) && (x < 2) && (y < x)) ? "YES" : "NO";
        System.out.println(res);
        Math.pow(2.0, 5);

    }
}
