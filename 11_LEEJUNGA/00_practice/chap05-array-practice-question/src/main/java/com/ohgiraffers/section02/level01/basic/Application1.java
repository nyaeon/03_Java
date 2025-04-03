package com.ohgiraffers.section02.level01.basic;

public class Application1 {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i * arr[i].length + j + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
