package HOMEWORK2_week.chep06.arrayhomework.hw2.dto;

import java.util.Scanner;

public class Application1_2 {

    public static void main(String[] args) {
        int count = 0;
        int avg = 0;
        int sum = 0;
        ClassDiagram[] member = new ClassDiagram[10];
        Scanner sc = new Scanner(System.in);
         while (true) {
             //    for (int i = 0; i < 10; i++) {

             member[count] = new ClassDiagram();

             System.out.print("학년 입력: ");
             member[count].setGrade(sc.nextInt());
             System.out.print("반 입력: ");
             member[count].setClassName(sc.nextInt());
             System.out.print("이름 입력: ");
             member[count].setName(sc.next());
             System.out.print("국어 입력: ");
             member[count].setKor(sc.nextInt());
             System.out.print("영어 입력: ");
             member[count].setEng(sc.nextInt());
             System.out.print("수학 입력: ");
             member[count].setMath(sc.nextInt());
             sum = member[count].getKor() + member[count].getEng() + member[count].getMath();
             sum += sum;
             avg = sum / 3;
             count++;

             while(true) {
             System.out.println("계속 추가 하시겠습니까? (y/n)");
             String answer = sc.nextLine();
                 if ((answer).equals("y")) {

                     continue;
                     //  return member[count];
                 } else  {
                     System.out.println("지금까지 입력된 학생 정보:");
                 }
                 for (int i = 0; i < count; i++) {
                     System.out.println(member[i].toString());
                 }
                 break;
             }
         }
     }
}


