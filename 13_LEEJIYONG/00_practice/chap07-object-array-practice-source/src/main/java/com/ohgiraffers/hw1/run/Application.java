package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {


    public static void main(String[] args) {
        EmployeeDTO[] employees = new EmployeeDTO[3];
        employees[0] = new EmployeeDTO();
        employees[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        employees[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222",
            "서울 마곡");

        for (EmployeeDTO employee : employees) {
            System.out.println(employee.information());
        }

        System.out.println("===============================================");
        employees[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999",
            "전라도 광주");
        employees[1].setDept("기획부");
        employees[1].setJob("부장");
        employees[1].setSalary(4000000);
        employees[1].setBonusPoint(0.3);

        System.out.println(employees[0].information());
        System.out.println(employees[1].information());

        int sum = 0;
        System.out.println("===============================================");
        for (EmployeeDTO dto : employees) {
            System.out.printf("%s의 연봉 : %d원\n", dto.getEmpName(), dto.getAnnualSalary());
            sum += dto.getAnnualSalary();
        }
        System.out.println("===============================================");
        System.out.printf("직원들의 연봉의 평균 : %d", sum / 3);

    }
}
