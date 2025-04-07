package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO stu[] = new StudentDTO[10];

        int count = 0;

        while(true) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            sc.nextLine();

            stu[count] = new StudentDTO(grade, classroom, name, kor, eng, math);

            count ++;

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            String str = sc.nextLine().toUpperCase();

            if(str.equals("N"))
                break;
        }

        for(StudentDTO s : stu) {
            if(s == null) {
                break;
            }

            int sum = s.getKor() + s.getEng() + s.getMath();

            System.out.println(s.information() + ", 평균=" + sum / 3);
        }
    }
}
