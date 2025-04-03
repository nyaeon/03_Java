package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO emp1 = new EmployeeDTO();
        EmployeeDTO emp2 = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        EmployeeDTO emp3 = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        EmployeeDTO[] emps = new EmployeeDTO[3];
        emps[0] = emp1;
        emps[1] = emp2;
        emps[2] = emp3;

        for (int i = 0; i < emps.length; i++) {
            System.out.println("emps["+i+"]" + emps[i].information());
        }

        System.out.println("=================================================================");

        emps[0].setEmpNo(0);
        emps[0].setEmpName("김말똥");
        emps[0].setDept("영업부");
        emps[0].setJob("팀장");
        emps[0].setAge(30);
        emps[0].setGender('M');
        emps[0].setSalary(3000000);
        emps[0].setBonusPoint(0.2);
        emps[0].setPhone("01055559999");
        emps[0].setAddress("전라도 광주");
        emps[1].setDept("기획부");
        emps[1].setJob("부장");
        emps[1].setSalary(4000000);
        emps[1].setBonusPoint(0.3);

        for (int i = 0; i < emps.length-1; i++) {
            System.out.println("emps["+i+"]" + emps[i].information());
        }
        System.out.println("=================================================================");

        int salavg = 0;
        for (int i = 0; i < emps.length; i++) {
            salavg += (emps[i].getSalary())*(1+emps[i].getBonusPoint())*12;
        }
        salavg /= emps.length;

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].getEmpName() + "의 연봉 : " + emps[i].getSalary()*(1+emps[i].getBonusPoint())*12 + "원");
        }
        System.out.println("=================================================================");
        System.out.println("직원들의 연봉의 평균 : " + salavg + "원");







    }

}


