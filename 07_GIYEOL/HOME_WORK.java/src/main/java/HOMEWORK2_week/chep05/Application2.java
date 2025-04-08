package HOMEWORK2_week.chep05;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int num =0;
        String low[] = new String[]{"딸기","바나나","복숭아","키위","사과"};
        Scanner sc = new Scanner(System.in);
        System.out.print("0~4까지 정수 입력:");
        num = sc.nextInt();

        //for (int i=0; i<low.length; i++) {
        if (num >= 0 && num <= 4) {
            System.out.print(low[num]);
        }else{
            System.out.print("다시 입력");

        }
//            if (num == 0) {
//                System.out.print(low[0]);
//            } else if (num == 1) {
//                System.out.print(i);
//            } else if (num == 2) {
//                System.out.print(i);
//            } else if (num == 3) {
//                System.out.print(i);
//            } else if (num == 4) {
//                System.out.print(i);
//            } else {
//                System.out.print("재입력 하세요");
//            }
    //}
}
}
