package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] dto = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);

        int i = 0;
        char answer;

        while (i < dto.length) {
            dto[i] = new StudentDTO();
            System.out.print("학년 : ");
            dto[i].setGrade(sc.nextInt());
            System.out.print("반 : ");
            dto[i].setClassroom(sc.nextInt());
            System.out.print("이름 : ");
            dto[i].setName(sc.next());
            System.out.print("국어점수 : ");
            dto[i].setKor(sc.nextInt());
            System.out.print("영어점수 : ");
            dto[i].setEng(sc.nextInt());
            System.out.print("수학점수 : ");
            dto[i].setMath(sc.nextInt());
            i++;
            System.out.print("더 입력하시겠습니까?(y/n) : ");
            answer = sc.next().charAt(0);

            if (!(answer == 'Y' || answer == 'y')) {
                break;
            }
        }

        for (i = 0; i < dto.length; i++) {
            if (dto[i] != null) {
                System.out.println(dto[i].infomation());
            }
        }

    }
}
