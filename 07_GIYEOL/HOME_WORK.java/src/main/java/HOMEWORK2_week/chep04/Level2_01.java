package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Level2_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요.단,반드시 1~10까지의 정수만 입력 :");
        int num = sc.nextInt();
        if(num %2==0 && num <=10){
            System.out.println("짝수다");
        }else if(num %2 !=0 && num <=10){
            System.out.println("홀수다");
        }else{
            System.out.println("범위를 벗어난 수");
        }
    }
}
