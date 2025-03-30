package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Level2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~12사이의 숫자 입력:");
        int wader = sc.nextInt();
        if(wader >= 3 && wader < 6){
            System.out.println("봄");
        }else if(wader >= 6 && wader < 9){
            System.out.println("여름");
        }else if(wader >= 9 && wader < 12){
            System.out.println("가을");
        }else if(wader == 12 || wader == 1 || wader == 2){
            System.out.println("겨울");
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
