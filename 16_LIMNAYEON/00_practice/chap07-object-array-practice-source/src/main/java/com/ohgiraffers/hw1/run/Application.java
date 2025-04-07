package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO[] emp = new EmployeeDTO[3];
        emp[0] = new EmployeeDTO();
        emp[1] = new EmployeeDTO(1, "홍길동", "부장", 19, "01022223333", "서울 잠실");
        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01,"01022223333", "서울 잠실");

        System.out.println(emp[0].information());
        System.out.println(emp[1].information());
        System.out.println(emp[2].information());
        System.out.println("==================================================================================================");

        emp[0].setEmpName("김말똥");
        emp[0].setDept("영업부");
        emp[0].setJob("팀장");
        emp[0].setAge(30);
        emp[0].setGender('M');
        emp[0].setSalary(3000000);
        emp[0].setBonosPoint(0.2);
        emp[0].setPhone("01055559999");
        emp[0].setAddress("전라도 광주");

        emp[1].setEmpName("홍길동");
        emp[1].setDept("기획부");
        emp[1].setJob("부장");
        emp[1].setAge(19);
        emp[1].setGender('M');
        emp[1].setSalary(4000000);
        emp[1].setBonosPoint(0.3);
        emp[1].setPhone("01022223333");
        emp[1].setAddress("서울 잠실");

        System.out.println(emp[0].information());
        System.out.println(emp[1].information());
        System.out.println("==================================================================================================");

        int emp0TotalSalary = (int)((emp[0].getSalary() + (emp[0].getSalary() * emp[0].getBonosPoint())) * 12);
        System.out.println(emp[0].getEmpName() + "의 연봉 : " + emp0TotalSalary);

        int emp1TotalSalary = (int)((emp[1].getSalary() + (emp[1].getSalary() * emp[1].getBonosPoint())) * 12);
        System.out.println(emp[1].getEmpName() + "의 연봉 : " + emp1TotalSalary);

        int emp2TotalSalary = (int)((emp[2].getSalary() + (emp[2].getSalary() * emp[2].getBonosPoint())) * 12);
        System.out.println(emp[2].getEmpName() + "의 연봉 : " + emp2TotalSalary);

        int result = (emp[0].getSalary() + emp[1].getSalary() + emp[2].getSalary()) / 3;

        System.out.println("==================================================================================================");
        System.out.println("직원들의 연봉의 평균 : " + result);


    }
}
