package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import javax.swing.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] students = new StudentDTO[10];

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        while (count < students.length) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            String answer = sc.next();
            if (!answer.equals("y")) {
                break;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(students[i].information() + "평균 : " + (students[i].getKor()+students[i].getEng()+students[i].getMath())/3 + "점");

        }
    }
}

