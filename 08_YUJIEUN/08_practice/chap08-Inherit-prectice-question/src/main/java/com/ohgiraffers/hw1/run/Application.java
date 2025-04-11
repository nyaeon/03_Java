package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        StudentDTO[] stu = new StudentDTO[3];

        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        stu[0] = new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        stu[1] = new StudentDTO("김말똥",21,187.3,80.0,2,"경영학과");
        stu[2] = new StudentDTO("강개순",23,167.0,45.0,4,"정보통신공학과");

        System.out.println("===== 학생 정보 =====");
        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
            for(StudentDTO dto : stu) {
            System.out.println(dto.information());
        }

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        EmployeeDTO[] emp = new EmployeeDTO[10];

        int counter = 0;
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        while (true){
            Scanner scanner = new Scanner(System.in);
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
            System.out.println("계속 추가 하시겠습니까? : ( y or n )");
        // 한 명씩 추가 될 때마다 카운트함
            String ans = scanner.nextLine();

            if (!ans.equalsIgnoreCase("y")) break;
                System.out.println("이름 : " );
                String name = scanner.next();
                System.out.println("나이 : ");
                int age = scanner.nextInt();
                System.out.println("신장 : ");
                double height = scanner.nextDouble();
                System.out.println("몸무게 : ");
                double weight = scanner.nextDouble();
                System.out.println("급여 : ");
                int salary = scanner.nextInt();
                System.out.println("부서 : ");
                String dept = scanner.next();

                emp[counter++] = new EmployeeDTO(name, age, height, weight, salary, dept);

            }

        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력
        System.out.println("\n===== 사원 정보 =====");
        for (int i = 0; i < counter; i++) {
            System.out.println(emp[i].information());
        }

    }
}
