package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = new StudentDTO();
            System.out.print("학년을 입력하세요 : ");
            students[i].setGrade(sc.nextInt());
            System.out.print("반을 입력하세요 : ");
            students[i].setClassroom(sc.nextInt());
            System.out.print("이름을 입력하세요 : ");
            students[i].setName(sc.next());
            System.out.print("국어점수를 입력하세요 : ");
            students[i].setKor(sc.nextInt());
            System.out.print("영어점수를 입력하세요 : ");
            students[i].setEng(sc.nextInt());
            System.out.print("수학점수를 입력하세요 : ");
            students[i].setMath(sc.nextInt());
            System.out.print("계속하시겠습니까? : ");
            char ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                count++;
            } else {
                for (int j = 0; j <= count; j++) {
                    System.out.println(students[j].information() + " 평균= "
                            + (students[j].getKor() + students[j].getEng() + students[j].getMath()) / 3);
                }
                break;
            }

            }
        }
    }


