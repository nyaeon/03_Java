package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO employee = new EmployeeDTO();
//        System.out.println(employee);
        employee.setNumber(200);
        employee.setName("홍길동");
        employee.setDept("영업부");
        employee.setJob("과장");
        employee.setAge(20);
        employee.setGender('남');
        employee.setSalary(2000000);
        employee.setBonusPoint(0.5);
        employee.setPhone("010-11234-5678");
        employee.setAddress("서울시 서초구 서초동");
        System.out.println(employee);
    }
}
