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
            sc.nextLine(); // 버퍼 비우기
            String answer = sc.nextLine();

        }
    }
}