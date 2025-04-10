package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.StudentDTO;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[10];

        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (true) {
            if (index >= 10) {
                break;
            }
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("반 : ");
            int classRoom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            sc.nextLine();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            sc.nextLine();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            sc.nextLine();
            students[index++] = new StudentDTO(grade, classRoom, name, kor, eng, math);

            System.out.print("계속 추가할 것인가요? (y이면 계속) : ");
            char c = sc.nextLine().charAt(0);
            if (c != 'Y' && c != 'y') {
                break;
            }
        }

        for (StudentDTO student : students) {
            if (student == null) {
                break;
            }
            System.out.printf("%s %.1f\n", student.information(), student.getAvg());
        }
    }
}
