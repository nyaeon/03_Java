package HOMEWORK2_week.chep05.array.section02;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Applicaton3_1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sum;
                sum++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println("=======================");
    }
//private final arr;
    public void arrayTest1(int[][]arr){
        System.arraycopy(arr[0], 0, arr[1], 0, arr[0].length);
        System.arraycopy(arr[1], 0, arr[2], 0, arr[0].length);
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sum;
                sum++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void arrayTest2(int[][]arr){}
    public void arrayTest3(int[][]arr){}
    public void arrayTest4(int[][]arr){}
    public void arrayTest5(int[][]arr){}
    public void arrayTest6(int[][]arr){}
    public void arrayTest7(int[][]arr){}
    public void print(int[][]arr){}
}
