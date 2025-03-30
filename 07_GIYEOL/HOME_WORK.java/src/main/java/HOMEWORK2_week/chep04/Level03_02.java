package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Level03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("과일을 입력하세요:");
        String str = sc.nextLine();
        switch (str) {
            case "사과":{
                System.out.println("사과 가격은 1000원");
            break;
            }
            case "바나나":{
                System.out.println("바나나 가격은 3000원");
            break;
            }
            case "복숭아":{
                System.out.println("복숭아 가격은 2000원");
            break;
            }
            case "키위":{
                System.out.println("키위 가격은 5000원");
                break;
            } default:{
                System.out.println("그런 과일은 없음");
            }
        }
    }
}
