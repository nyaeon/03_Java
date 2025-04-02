package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[10];
        int count = 0;

        // 반복 입력
        while (true) {
            System.out.println("학생 정보를 입력하세요.");

            System.out.print("학년: ");
            int grade = sc.nextInt();

            System.out.print("반: ");
            int classroom = sc.nextInt();

            sc.nextLine();

            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("국어점수: ");
            int kor = sc.nextInt();

            System.out.print("영어점수: ");
            int eng = sc.nextInt();

            System.out.print("수학점수: ");
            int math = sc.nextInt();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            System.out.print("계속 추가하시겠습니까? (y/n): ");
            sc.nextLine();
            String answer = sc.nextLine();

            // equalsIgnoreCase 대소문자 구분안함. 즉, 대소문자 상관없이 'y'이면 계속 객체 추가
            if (!answer.equalsIgnoreCase("y") || count >= 10) {
                break; // 대소문자 상관없이 "y" 이거나 10명까지 기록 가능함. 부정이니 count가 10보다 작거나 같을때까지 구하고 종료.
            }
        }
        double totalAvg = 0;

        for (int i = 0; i < count; i++) {
            System.out.println(students[i].information());

            int avg = (students[i].getKor() + students[i].getEng() + students[i].getMath()) / 3;
            System.out.println("평균 = " + avg);
            totalAvg += avg;
        }
    }
}
