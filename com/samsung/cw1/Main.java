package com.samsung.cw1;

public class Main {
    public static void main(String[] args) {
        /*for(int i = 0; i < 100; i = i +1){
            System.out.println(i);*/
        /*int i = 0;
        for (;i < 100;){
            System.out.println(1);
            i++;*/
        /*int[] array;
        array = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println(array[i]);
            array[9] = 10;
        }*/
        int[] array = new int[5];
        double res = 0;
        for (int i = 0; i < array.length; i ++){
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
            res += array[i];


        }
        System.out.println(res / array.length);

    }
    }

