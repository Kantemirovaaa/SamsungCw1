package com.samsung.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println();//новая строчка
        double aDouble = 3.343443343434;
        System.out.print("jfojfoe" + "\n");//это как println
        System.out.printf("%.3f", aDouble);//сокращает до нужного кол-ва знаков
        System.out.printf("%.3f | %.5f", aDouble, aDouble);//String.format(), metanit
        StringBuilder stringBuilder = new StringBuilder();//скок угодно раз будет добавлять строе
        */


        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //int count = 1;
        /*do {
            n = scanner.nextInt();
            count++;
        }while (n>=0);
            n = scanner.nextInt();
            count++;*/
        /*while (n < 100) {
            System.out.println(n);
            n ++;
        }*/
        /*do{
            System.out.println(n);
        }while(n < 100);*/
        /*int n, count = 0;
        do{
            n = scanner.nextInt();
            count++;
        } while(n >=0);
        System.out.println(count);
        scanner.close();*/
        int n = scanner.nextInt();
        while(n < 100){
            n ++;
            if(n == 71) continue;
            System.out.println(n);
        }



    }
}
