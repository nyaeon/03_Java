package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Level2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 몸무게를 입력하세요:");
        double kg = sc.nextDouble();
        System.out.print("키를 입력하세요:");
        double m = sc.nextDouble();
        double bmi = kg/(m*m);
        if(bmi <20){
            System.out.println("당신은 저체중입니다.");
        }else if(bmi >= 20 && bmi < 25){
            System.out.println("당신은 정상체중입니다.");

        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("당신은 과체중입니다.");
        }else {
            System.out.println("비만입니다.");
        }
    }
}
