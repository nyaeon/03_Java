package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요:");
        int child =sc.nextInt();

        if(child >= 20){
            System.out.print("성인 입니다");
        }else if(child >= 13){
            System.out.println("청소년 입니다");
        }else{
            System.out.println("어린이 입니다");
        }

    }
}


