package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDTO[] stu = new StudentDTO[10];
        int count = 0;

        while(count < 10) {

            System.out.println((count+1) + "번째 학생의 정보를 입력해 주세요: ");;

            stu[count] = new StudentDTO();
            stu[count].setGrade(sc.nextInt());
            stu[count].setClassroom(sc.nextInt());
            sc.nextLine();
            stu[count].setName(sc.nextLine());
            stu[count].setKor(sc.nextInt());
            stu[count].setEng(sc.nextInt());
            stu[count].setMath(sc.nextInt());
            sc.nextLine();

            System.out.println("학생을 추가하시겠습니까?");

            String ans = sc.nextLine();
            if(!ans.equals("y") || ans.equals("Y") ) {
                System.out.println("입력을 종료하셨습니다.");
                break;
            }

            ++count;
        }
        for (int i = 0; i <= count; i++) {
            int sum = stu[i].getKor() + stu[i].getEng() + stu[i].getMath();
            double avg = sum / 3;
            System.out.println(stu[i].information() + ", 평균" + (int)avg);
        }
    }
}
