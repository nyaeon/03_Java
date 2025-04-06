package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] stu = new StudentDTO[3];

        stu[0] = new StudentDTO("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
        stu[1] = new StudentDTO("김말똥", 21, 187.3, 80, 2, "경영학과");
        stu[2] = new StudentDTO("강개순", 23, 167.0, 45, 4, "정보통신공학과");

        for(StudentDTO s : stu) {
            System.out.println(s.information());
        }

        Scanner sc = new Scanner(System.in);

        EmployeeDTO emp[] = new EmployeeDTO[10];
        int count = 0;

        while(true) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("키 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("급여 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서 : ");
            String dept = sc.nextLine();

            emp[count] = new EmployeeDTO(name, age, height, weight, salary, dept);

            count ++;

            System.out.print("계속 입력하시겠습니까? (y/n) : ");
            char ch = sc.nextLine().toUpperCase().charAt(0);

            if(ch == 'N') {
                break;
            }
        }

        for(int i=0; i<count; i++) {
            System.out.println(emp[i].information());
        }
    }
}
