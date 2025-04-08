package HOMEWORK2_week.chep05.array.section02;

import java.util.Random;

public class Application1_1 {
    public static void main(String[] args) {
    int[][] num = new int[3][4];
    int sum = 1;
    for (int i =0; i < num.length; i++) {
        for (int j =0; j < num[i].length; j++) {
            num[i][j] = sum;
            sum++;
            }
        }
    for (int i =0; i < num.length; i++) {
        for (int j =0; j < num[i].length; j++) {
            System.out.print(num[i][j] + " ");
        }
        System.out.println();
    }
    }
}
