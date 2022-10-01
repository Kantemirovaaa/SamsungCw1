package com.samsung.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, h, m, s;
        n = sc.nextInt();
        h = n / 3600;
        m = (n - (h * 3600)) / 60;
        s = (n - (m * 60 + h * 3600));
        System.out.println(h % 24 + ":" + m + ":" + s);

        /*byte aByte = -128;
        short aShort = 30000;
        int aInt = 2000000000;
        long aLong = 20000000000L;
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aInt);
        System.out.println(aLong);
        double  aDouble = 8.3434343443;
        System.out.println(aDouble);
        //boolean aBoolean = true;
        boolean aBoolean = 3 != 4;
        System.out.println(aBoolean);
        char aChar = 'a';
        System.out.println((char) (97 + 1));
        int a = 10, b = 5;
        int res;
        res = a + b;
        System.out.println(res);
        res = a -b;
        System.out.println(res);
        res = a * b;
        System.out.println(res);
        res = a / b;
        System.out.println(res);
        res = a % b;
        System.out.println(res);
        int i = 0;
        System.out.println(i++);//i = i + 1
        System.out.println(i--);//i = i -1
        System.out.println(i);
        i += 5; //i = i + 5
        i /= 2;// i = i / 2, +=, %=**/

    }
}
