package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO[] students = new StudentDTO[3];
        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80, 2, "경영학과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (StudentDTO student : students) { // 향상된 for문 이용
            System.out.println(student.information());
        }

        EmployeeDTO[] employees = new EmployeeDTO[10];
        int count = 0;

        while (true) { // while(true) 무한 반목문을 통해
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("키 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("급여 : ");
            int salary = sc.nextInt();
            System.out.print("부서 : ");
            String dept = sc.next();

            employees[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;

            System.out.print("계속 입력하시겠습니까? (y/n) : ");
            String answer = sc.next();
            if (!answer.equals("y")) {
                break;
            }
        }

        for (int i = 0; i<count; i++) {
            System.out.println(employees[i].information());
        }
        sc.close();
    }
}
