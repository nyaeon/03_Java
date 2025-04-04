package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)

        Scanner sc = new Scanner(System.in);

        StudentDTO[] stu = new StudentDTO[10];

        int count = 0;
        while (true) {

            System.out.println("학년을 입력하세요 : ");
            int grade = sc.nextInt();
            System.out.println("반을 입력하세요 : ");
            int classroom = sc.nextInt();
            System.out.println("이름을 : 입력하세요 :");
            String name = sc.next();
            System.out.println("국어 성적을 입력하세요 : ");
            int kor = sc.nextInt();
            System.out.println("영어 성적을 입력하세요 : ");
            int eng = sc.nextInt();
            System.out.println("수학 성적을 입력하세요 : ");
            int math = sc.nextInt();
            stu[count++] = new StudentDTO(grade, classroom, name, kor, eng, math);
            System.out.println("계속 추가 하실겁니까? : y/n");
            char answer  = sc.next().charAt(0);
            if (answer == 'y') {
                continue;
            } else {
                break;
            }
        }

        for (StudentDTO s : stu) {
            if (s != null) {
                System.out.println(s.information());
                int sum = s.getKor()+s.getEng()+s.getMath();
                System.out.println("학생들의 평균은 : " + sum / 3);
            }
        }
    }
}


