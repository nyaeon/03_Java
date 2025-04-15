package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        StudentDTO[] students = new StudentDTO[3];


        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과'");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new StudentDTO("김개순", 23, 167.0, 45.0, 4, "정보통신공학과)");

        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
        for (StudentDTO student : students) {
            System.out.println(student.information());
        }

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        EmployeeDTO[] emp = new EmployeeDTO[10];

        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        Scanner sc = new Scanner(System.in);

        int count = 0;
        boolean flag = false;
        do {
            for (int i = 0; i < emp.length; i++) {
                System.out.print("사원의 이름은? : ");
                String name = sc.next();
                System.out.print("사원의 나이는? : ");
                int age = sc.nextInt();
                System.out.print("사원의 신장은? : ");
                int height = sc.nextInt();
                System.out.print("사원의 몸무게는? : ");
                int weight = sc.nextInt();
                System.out.print("사원의 급여는? : ");
                int salary = sc.nextInt();
                System.out.print("사원의 부서는? : ");
                String dept = sc.next();
                emp[i] = new EmployeeDTO(name, age, height, weight, salary, dept);

                // 한 명씩 추가 될 때마다 카운트함
                count++;


                // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
                System.out.print("계속 추가할 것인가요? (y/n): ");
                char c = sc.next().charAt(0);

                // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
                if (c == 'y' || c == 'Y') {
                    flag = true;
                } else if (c == 'n' || c == 'N') {
                    flag = false;
                    break;
                }
            }
        } while (flag);

        System.out.println("총 " + count + "명");

        // 현재 기록된 사원들의 정보를 모두 출력
        for (int i = 0; i < emp.length; i++) {
            if(emp[i] != null) {
                System.out.println(emp[i].information());
            }
        }

    }





}
