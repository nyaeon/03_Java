package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import javax.swing.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] students = new StudentDTO[10];
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        while (true) {
            students[count] = new StudentDTO();

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

            count++;

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            String answer = sc.next();
            if (answer.equals("y")) {}
            else {
                    break;}




        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].information() + "평균 : " + (students[i].getKor()+students[i].getEng()+students[i].getMath())/3 + "점");

        }
        // 한 명씩 추가 될 때마다 카운트함
        System.out.println(students[0].information() + "평균 : " + (students[0].getKor()+students[0].getEng()+students[0].getMath())/3 + "점");
        System.out.println(students[1].information() + "평균 : " + (students[1].getKor()+students[1].getEng()+students[1].getMath())/3 + "점");
        System.out.println(students[2].information() + "평균 : " + (students[2].getKor()+students[2].getEng()+students[2].getMath())/3 + "점");
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)

    }
}

