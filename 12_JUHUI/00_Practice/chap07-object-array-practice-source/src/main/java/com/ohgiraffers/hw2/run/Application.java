package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] student = new StudentDTO[10];

        Scanner sc = new Scanner(System.in);

        int count = 0;

        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        while (count < 10) {
            System.out.println("학생 정보를 입력하세요 : 학년 반 이름 국어점수 영어점수 수학점수 ");
            String input = sc.nextLine();

            // 입력된 문자열을 공백을 기준으로 분리
            String[] info = input.split(" ");

            // 입력한 정보가 충분한지 확인 (학년, 반, 이름, 3과목 점수 = 총 6개 항목)
            if (info.length >= 6) {
                int grade = Integer.parseInt(info[0]);
                int classroom = Integer.parseInt(info[1]);
                String name = info[2];
                int kor = Integer.parseInt(info[3]);
                int eng = Integer.parseInt(info[4]);
                int math = Integer.parseInt(info[5]);

                // 입력받은 정보로 학생 객체 생성하여 배열에 추가
                student[count] = new StudentDTO(grade, classroom, name, kor, eng, math);

                // 한 명씩 추가 될 때마다 카운트함
                count++;

                // 적어도 3명 이상 입력되었는지 확인하고, 계속 추가할 것인지 물어봄
                if (count >= 3) {
                    System.out.println("계속 추가하시겠습니까? (y/n) :");
                    String answer = sc.nextLine().toLowerCase();

                    if (!answer.equals("y")) {
                        break;
                    }
                }
                // 6개의 항목을 다 채우지 못했을때
            } else {
                System.out.println("입력 형식이 잘못되었습니다. 학년 반 이름 국어점수 영어점수 수학점수 순으로 입력해주세요.");
            }

        }

        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)
        System.out.println("\n입력된 학생 정보를 출력해보겠습니다");
        for (int i = 0; i < count; i++) {
            System.out.println(student[i].information());
        }

        sc.close();


    }

}
