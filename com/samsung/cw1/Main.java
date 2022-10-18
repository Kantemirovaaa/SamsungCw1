package com.samsung.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 19, 20, -100, 1000};
        int[] arr1 = {101, 19, 19, 20, -100, 1000};
        printArray(arr);
        printArray(arr1);



    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i ++){
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}
