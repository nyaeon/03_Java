package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        PersonDTO[] students = new PersonDTO[3];

        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new StudentDTO("길말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신학과");

        for (PersonDTO p : students) {
            System.out.println(p.information());
        }

        PersonDTO[] employees = new PersonDTO[10];
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("신장 : ");
            double height = Double.parseDouble(sc.nextLine());
            System.out.print("몸무게 : ");
            double weight = Double.parseDouble(sc.nextLine());
            System.out.print("급여 : ");
            int salary = Integer.parseInt(sc.nextLine());
            System.out.print("부서 : ");
            String dept = sc.nextLine();

            employees[cnt++] = new EmployeeDTO(name, age, height, weight, salary, dept);

            System.out.print("계속 추가 할 것 입니까? (Y) : ");
            char c = sc.nextLine().charAt(0);
            if (Character.toUpperCase(c) != 'Y') {
                break;
            }
        }

        for (PersonDTO employee : employees) {
            if (employee == null) {
                return;
            }
            System.out.println(employee.information());
        }
    }
}
