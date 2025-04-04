package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        PersonDTO[] people = new StudentDTO[3];
        people[0] = new StudentDTO(20, 178.2, 70.0, 1, "정보시스템공학과");
        people[0].setName("홍길동");
        people[1] = new StudentDTO(21, 187.3, 80.0, 2, "경영학과");
        people[1].setName("김말똥");
        people[2] = new StudentDTO(23, 167.0, 45.0, 4, "정보통신공학과");
        people[2].setName("강개순");
        for (PersonDTO person : people) {
            System.out.println(person.information());
        }
        PersonDTO[] people2 = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true) {
            System.out.print("이름을 입력 : ");
            String name = sc.next();
            System.out.print("나이를 입력 : ");
            int age = sc.nextInt();
            System.out.print("신장을 입력 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게를 입력 : ");
            double weight = sc.nextDouble();
            System.out.print("급여를 입력 : ");
            int salary = sc.nextInt();
            System.out.print("부서를 입력");
            String dept = sc.next();
            people2[count] = new EmployeeDTO(age, height, weight,salary, dept);
            people2[count].setName(name);
            count++;
            System.out.print("계속 입력하시겠습니까? : ");
            char choice = sc.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                continue;
            } else {
                for(int j = 0; j < count; j++) {
                    System.out.println(people2[j].information());
                }
               break;
            }
        }
    }
}
