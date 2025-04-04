package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] students = new StudentDTO[10];
        int count = 0;
        String choice;

        do {
            if (count >= students.length) {
                System.out.println("더 이상 학생을 추가할 수 없습니다.");
                break;
            }

            System.out.print("학년: ");
            int grade = sc.nextInt();
            System.out.print("반: ");
            int classroom = sc.nextInt();
            sc.nextLine();  // 개행 문자 처리
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("국어 점수: ");
            int kor = sc.nextInt();
            System.out.print("영어 점수: ");
            int eng = sc.nextInt();
            System.out.print("수학 점수: ");
            int math = sc.nextInt();
            sc.nextLine();  // 개행 문자 처리

            students[count++] = new StudentDTO(grade, classroom, name, kor, eng, math);

            System.out.print("계속 입력하시겠습니까? (Y/N): ");
            choice = sc.nextLine().trim().toLowerCase();
        } while (choice.equals("y"));

        System.out.println("\n입력된 학생 정보:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].information());
        }

        sc.close();
    }
}