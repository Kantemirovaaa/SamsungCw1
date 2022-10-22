package com.samsung.cw1;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[10][0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[(int) (Math.random() * 10)];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");

        }
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");"\t
        }*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j) {
                    System.out.println(arr[i][j] + " ");
                    break;
                }


            }
        }
    }
}
