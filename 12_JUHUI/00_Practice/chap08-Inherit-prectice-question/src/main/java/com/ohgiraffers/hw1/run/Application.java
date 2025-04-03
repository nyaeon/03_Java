package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        StudentDTO[] student = new StudentDTO[3];

        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        student[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        student[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        student[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        System.out.println("===== 학생 정보 =====");
        // 학생 정보 모두 출력 (향상된 for문 이용)
        for (StudentDTO students : student) {
            System.out.println(students.information());
        }

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        EmployeeDTO[] employee = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);

        // 사원 수를 카운트할 변수
        int count = 0;

        // 무한 반복문을 통해 사원 정보 입력
        while (true) {
            System.out.println("\n===== 사원 정보 입력 =====");

            // 사원 정보 입력 받기
            System.out.print("이름: ");
            String name = sc.next();

            System.out.print("나이: ");
            int age = sc.nextInt();

            System.out.print("키 : ");
            double height = sc.nextDouble();

            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();

            System.out.print("급여: ");
            int salary = sc.nextInt();

            System.out.print("부서: ");
            String dept = sc.next();

            // 입력받은 정보로 사원 객체 생성 및 배열에 저장
            employee[count] = new EmployeeDTO(name, age, height, weight, salary, dept);

            // 사원 수 증가
            count++;

            // 2명 정도 입력 받으면 충분하므로 추가 입력 여부 확인
            System.out.print("\n계속 추가하시겠습니까? (y/n): ");
            String answer = sc.next().toLowerCase(); // 대소문자 구분 없이 'y' 확인

            if (!answer.equals("y")) {
                break; // y가 아니면 반복문 종료
            }


            // 배열 크기를 초과하는지 체크
            if (count >= employee.length) {
                System.out.println("더 이상 사원을 추가할 수 없습니다.");
                break;
            }
        }

        // 사원 정보 출력
        for (int i = 0; i < count; i++) {
            System.out.println(employee[i].information());
        }

        sc.close();
    }
}
