package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] stus = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char yn = 'y';


        while (yn == 'Y' || yn == 'y') {
            StudentDTO stu = new StudentDTO();
            System.out.print("학년: ");
            stu.setGrade(sc.nextInt()) ; ;
            System.out.print("반: ");
            stu.setClassroom(sc.nextInt());
            System.out.print("이름: ");
            stu.setName(sc.next());
            System.out.print("국어점수: ");
            stu.setKor(sc.nextInt());
            System.out.print("영어점수: ");
            stu.setEng(sc.nextInt());
            System.out.print("수학점수: ");
            stu.setMath(sc.nextInt());

            stus[count] = stu;
            count += 1;
            System.out.print("계속 추가하시겠습니까? (y/n) : ");
            yn = sc.next().charAt(0);
        }

        for (int i = 0; i < count; i++) {
            System.out.print(stus[i].information() + " ");
            System.out.println("평균 점수 : " + ((stus[i].getKor() + stus[i].getEng() + stus[i].getMath())/3) + "점");
        }



    }

}
