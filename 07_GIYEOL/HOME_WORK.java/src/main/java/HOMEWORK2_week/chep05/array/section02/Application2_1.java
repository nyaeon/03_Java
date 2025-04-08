package HOMEWORK2_week.chep05.array.section02;

import java.util.Random;
import java.util.Scanner;

public class Application2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int w =0;
        int h =0;
        while (true){
            System.out.print("가로 행 : ");
            w = sc.nextInt();
            if (w >=1 && w <= 10) {
                break;
            } else {
                System.out.println("반드시 1~10까지의 정수 입력");
            }
        }
        while (true){
            System.out.print("세로 행 : ");
            h = sc.nextInt();
            if (h >=1 && h <= 10){
                break;
            } else {
                System.out.println("반드시 1~10까지의 정수 입력");
            }
        }
        char[][] arr = new char[w][h];
            for (int i =0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    arr[i][j] = (char) ('a' + r.nextInt(26));
                }
            }

          for (int i =0; i < w; i++) {
              for (int j =0; j < h; j++) {
                  System.out.print(arr[i][j] + " ");
              }
              System.out.println();
          }
    }
}
