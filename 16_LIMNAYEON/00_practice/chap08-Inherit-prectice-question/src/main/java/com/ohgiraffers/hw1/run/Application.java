package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        StudentDTO[] st = new StudentDTO[3];
        st[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        st[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        st[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        System.out.println("========= 학생 리스트 ==========");
        for (StudentDTO dto : st) {
            System.out.println(dto.information());
        }

        Scanner sc = new Scanner(System.in);
        EmployeeDTO[] emp = new EmployeeDTO[10];

        int count = 0;
        while (count < emp.length) {
            EmployeeDTO emp2 = new EmployeeDTO();

            System.out.println("====== 사원 정보를 입력하세요 ======");
            System.out.print("이름 : ");
            emp2.setName(sc.nextLine());

            System.out.print("나이: ");
            emp2.setAge(sc.nextInt());
            sc.nextLine();

            System.out.print("키: ");
            emp2.setHeight(sc.nextDouble());
            sc.nextLine();

            System.out.print("몸무게: ");
            emp2.setWeight(sc.nextDouble());
            sc.nextLine();

            System.out.print("연봉: ");
            emp2.setSalary(sc.nextInt());
            sc.nextLine();

            System.out.print("부서: ");
            emp2.setDept(sc.nextLine());

            emp[count++] = emp2;

            System.out.println("계속 추가하시겠습니까? (y/n)");
            String answer = sc.nextLine();
            if (!(answer.equals("Y") || answer.equals("y"))) {
                break;
            }
        }

        System.out.println("====== 전체 사원 리스트 ======");
        for (int i = 0; i < count; i++) {
            System.out.println(emp[i].information());
        }
    }


}
