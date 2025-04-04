package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] students = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);


        boolean flag = true;
        while (flag) {
            for (int i = 0; i < students.length; i++) {
                students[i] = new StudentDTO();
                System.out.print("학생의 학년은? : ");
                students[i].setGrade(sc.nextInt());
                System.out.print("학생의 반은? : ");
                students[i].setClassroom(sc.nextInt());
                System.out.print("학생의 이름은? : ");
                students[i].setName(sc.next());
                System.out.print("학생의 국어점수는? : ");
                students[i].setKor(sc.nextInt());
                System.out.print("학생의 영어점수는? : ");
                students[i].setEng(sc.nextInt());
                System.out.print("학생의 수학점수는? : ");
                students[i].setMath(sc.nextInt());

                System.out.print("계속 추가할 겁니까? (y/n) : ");
                char ch = sc.next().charAt(0);
                if (ch == 'n') {
                    flag = false;
                    break;
                }
            }
        }


        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.print(students[i].information());
                int avg = (int) (((students[i].getEng() + students[i].getMath() + students[i].getKor()) / 3));
                System.out.println(avg);
            } else {
                break;
            }
        }
    }
}
