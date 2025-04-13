package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서

        StudentDTO[] students = new StudentDTO[3];

        students[0] = new StudentDTO("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80, 2, "경영학과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45, 4, "정보통신공학과");

        for (StudentDTO student : students) {
            System.out.println(student.information());
        }


        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함
        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력

        EmployeeDTO[] employees = new EmployeeDTO[10];

        int count = 0;

        while (true) {
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("신장 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("급여 : ");
            int salary = sc.nextInt();
            System.out.print("부서 : ");
            String dept = sc.next();

            employees[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;

            System.out.print("계속 추가하시겠습니까? (y/n): ");
            char answer = sc.next().charAt(0);
            if (answer == 'y' || answer == 'Y') {
                continue;
            } else {
                break;
            }
        }

        for(int i = 0; i < count; i++) {
            System.out.println(employees[i].information());
        }
    }
}
