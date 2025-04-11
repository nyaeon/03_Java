package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] studentDTO = new StudentDTO[10];
        int counter = 0;
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)



        do{
            Scanner sc = new Scanner(System.in);

            System.out.print("학년: ");
            int grade = sc.nextInt();

            System.out.print("반: ");
            int classroom = sc.nextInt();

            System.out.print("이름: ");
            String name = sc.next();

            System.out.print("국어점수: ");
            int kor = sc.nextInt();

            System.out.print("영어점수: ");
            int eng = sc.nextInt();

            System.out.print("수학점수: ");
            int math = sc.nextInt();

            studentDTO[counter]  = new StudentDTO(math,eng,kor,name,grade,classroom);
            counter++;

            System.out.print("계속 추가할 겁니까? (y/n)");
            String answer = sc.next();

            if(answer.equals("n")){
                break;
            }


        }while(counter<10);

        for(int i=0; i<counter; i++) {
            System.out.print(studentDTO[i].information());
            int kor = studentDTO[i].getKor();
            int eng = studentDTO[i].getEng();
            int math = studentDTO[i].getMath();
            System.out.println(" 평균 = " + (kor + eng  +math)/3);}









    }
}
