package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO[] employees = new EmployeeDTO[3];

        employees[0] = new EmployeeDTO();
        employees[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        employees[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("emp[" + i + "] : " + employees[i].information());
        }
        System.out.println("==========================================");

        employees[0].setEmpName("김말똥");
        employees[0].setDept("영업부");
        employees[0].setJob("팀장");
        employees[0].setAge(30);
        employees[0].setGender('남');
        employees[0].setSalary(3000000);
        employees[0].setBonusPoint(0.2);
        employees[0].setPhone("01055559999");
        employees[0].setAddress("전라도 광주");

        employees[1].setDept("기획부");
        employees[1].setJob("부장");
        employees[1].setSalary(4000000);
        employees[1].setBonusPoint(0.3);
        for (int i = 0; i < 2; i++) {
            System.out.println("emp[" + i + "] : " + employees[i].information());
        }
        System.out.println("==========================================");
        int[] salArr = new int[3];
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            salArr[i] = (int) (employees[i].getSalary() +
                    (employees[i].getSalary() * employees[i].getBonusPoint())) * 12;
            sum += salArr[i];
            System.out.println(employees[i].getEmpName() + "의 연봉 : " + salArr[i] + "원");
        }
        System.out.println("===========================================");
        int avgSalary = 0;
        avgSalary = sum / 3;
        System.out.println("직원들의 연봉의 평균 : " + avgSalary + "원");

    }
}