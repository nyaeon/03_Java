package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] students = new StudentDTO[10];

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        while (cnt < 10) { /* 최대 10명 기록*/
            System.out.print("학년 : ");
            int grade = sc.nextInt();

            System.out.print("반 : ");
            int classRoom = sc.nextInt();

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("국어점수 : ");
            int kor = sc.nextInt();

            System.out.print("영어점수  : ");
            int eng = sc.nextInt();

            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            // 배열에 저장
            students[cnt++] = new StudentDTO(grade, classRoom, name, kor, eng, math);

            sc.nextLine(); // 버퍼 제거

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            char ch = sc.nextLine().charAt(0);

            if (ch != 'y' && ch != 'Y') {
                break;
            }
        }

        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)
        for (int i = 0; i < cnt; i++) {
            double avg = (double) (students[i].getKor() + students[i].getEng() + students[i].getMath()) / 3;
            System.out.println(students[i].information() + ", 평균=" + avg);
        }

    /*
     출력 결과

     학년 : 1, 반 : 5, 이름 : 홍길동, 국어점수 : 40, 영어점수 : 60, 수학점수 : 70, 평균점수 : 56.666666666666664
     학년 : 2, 반 : 1, 이름 : 김말똥, 국어점수 : 70, 영어점수 : 80, 수학점수 : 100, 평균점수 : 83.33333333333333
     학년 : 3, 반 : 3, 이름 : 강개순, 국어점수 : 100, 영어점수 : 75, 수학점수 : 86, 평균점수 : 87.0
     */
    }
}
