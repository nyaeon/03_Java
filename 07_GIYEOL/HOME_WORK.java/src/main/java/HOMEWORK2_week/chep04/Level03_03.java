package HOMEWORK2_week.chep04;

import java.util.Scanner;

public class Level03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 입력:");
        int k = sc.nextInt();
        System.out.print("영어 점수 입력:");
        int e = sc.nextInt();
        System.out.print("수학 점수 입력:");
        int m = sc.nextInt();
        double avg = (k+e+m)/3.0;
        boolean point =true;
        if(avg<60) {
            System.out.println("불합격입니다");
            point=false;
        }
        if(k<40){
            System.out.println("국어 점수 미달");
            point=false;
        }
        if(e<40){
            System.out.println("영어 점수 미달");
            point=false;
        }
        if(m<40){
            System.out.println("수학 점수 미달");
            point=false;
        }
        if(point){
            System.out.println("합격입니다.");
        }
    }
}
