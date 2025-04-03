package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDTO[] stus = new StudentDTO[3];
        EmployeeDTO[] emps = new EmployeeDTO[10];

        for (int i = 0; i < 3; i++) {
            StudentDTO stu = new StudentDTO();
            System.out.print("학생 이름 : ");
            stu.setName(sc.next());;
            System.out.print("학생 나이 : ");
            stu.setAge(sc.nextInt());;
            System.out.print("학생 신장 : ");
            stu.setHeight(sc.nextDouble());
            System.out.print("학생 몸무게 : ");
            stu.setWeight(sc.nextDouble());
            System.out.print("학생 학년 : ");
            stu.setGrade(sc.nextInt());
            System.out.print("학생 전공 : ");
            stu.setMajor(sc.next());

            stus[i] = stu;
        }

        int[] numbers = {0, 1, 2};
        for (int num : numbers) {
            System.out.println(stus[num].information());
        }

        int count = 0;
        char yn = 'y';
        while (yn == 'y' || yn == 'Y') {
            EmployeeDTO emp = new EmployeeDTO();
            System.out.print("사원 이름 : ");
            emp.setName(sc.next());
            System.out.print("사원 나이 : ");
            emp.setAge(sc.nextInt());
            System.out.print("사원 신장 : ");
            emp.setHeight(sc.nextDouble());
            System.out.print("사원 몸무게 : ");
            emp.setWeight(sc.nextDouble());
            System.out.print("사원 급여 : ");
            emp.setSalary(sc.nextInt());
            System.out.print("사원 부서 : ");
            emp.setDept(sc.next());
            emps[count] = emp;
            count += 1;
            System.out.println("계속 추가하시겠습니까? (y/n) : ");
            yn = sc.next().charAt(0);
        }

        for (int i = 0; i < count; i++) {
            System.out.println(emps[i].information());
        }

    }










}
