package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
    // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
    // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
    // 연봉 = (급여 + (급여 * 보너스포인트)) * 12
    // 3명의 직원의 연봉 평균을 구하여 출력

        EmployeeDTO[] employees = new EmployeeDTO[3];
        employees[0] = new EmployeeDTO();
        employees[1] = new EmployeeDTO( 1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울 잠실");
        employees[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        System.out.println("===========================================================================");

        for (int i = 0; i < employees.length; i++) {

            System.out.println(
                    employees[i].information()
            );
        }

        System.out.println("===========================================================================");
        employees[0].setEmpName("김말똥");
        employees[0].setDept("영업부");
        employees[0].setJob("팀장");
        employees[0].setAge(30);
        employees[0].setGender('M');
        employees[0].setSalary(3000000);
        employees[0].setBonusPoint(0.2);
        employees[0].setPhone("01055559999");
        employees[0].setAddress("전라도 광주");
        System.out.println(employees[0].information());


        employees[1].setEmpName("홍길동");
        employees[1].setDept("기획부");
        employees[1].setJob("기획부");
        employees[1].setAge(19);
        employees[1].setGender('M');
        employees[1].setSalary(4000000);
        employees[1].setBonusPoint(0.3);
        employees[1].setPhone("01022223333");
        employees[1].setAddress("서울 잠실");
        System.out.println(employees[1].information());

        System.out.println("===========================================================================");


        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i].getSalary();
            double bonus = employees[i].getBonusPoint();
            int year=(int)(salary +  (salary *  bonus)) * 12;
            System.out.println(year);
        }

        System.out.println("===========================================================================");

        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i].getSalary();
            double bonus = employees[i].getBonusPoint();
            int year=(int)(salary +  (salary *  bonus)) * 12;
            System.out.println(year);
        }








    }
}
