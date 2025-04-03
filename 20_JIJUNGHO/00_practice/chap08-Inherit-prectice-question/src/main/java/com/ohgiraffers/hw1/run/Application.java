package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] student = new StudentDTO[3];

        student[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        student[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        student[2] = new StudentDTO("강개순", 23,167.0,45.0,4,"정보통신공학과");
        for (StudentDTO studentDTO : student) {
            System.out.println(studentDTO.infomation());
        }

        EmployeeDTO[] employee = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        char answer;
        while (i < employee.length) {
            employee[i] = new EmployeeDTO();
            System.out.print("이름 : ");
            employee[i].setName(sc.next());
            System.out.print("나이 : ");
            employee[i].setAge(sc.nextInt());
            System.out.println("신장(cm) : ");
            employee[i].setHeight(sc.nextDouble());
            System.out.print("몸무게(kg) : ");
            employee[i].setWeight(sc.nextDouble());
            System.out.print("급여 : ");
            employee[i].setSalry(sc.nextInt());
            System.out.print("부서 : ");
            employee[i].setDept(sc.next());
            i++;
            System.out.print("계속 추가 하시겠습니까?(y/n) : ");
            answer = sc.next().charAt(0);

            if (!(answer == 'y' || answer == 'Y')) {
                break;
            }
        }

        for (i = 0; i <employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].infomation());
            }
        }


    }
}
