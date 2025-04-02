package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO dto = new EmployeeDTO();

        dto.setNumber(200);
        dto.setName("홍길동");
        dto.setDept("영업부");
        dto.setJob("과장");
        dto.setAge(20);
        dto.setGender('남');
        dto.setSalary(2000000);
        dto.setBonusPoint(0.5);
        dto.setPhone("010-1234-5678");
        dto.setAddress("서울시 서초구 서초동");

        //getter는 받기만 하고 출력이 안되기 때문에 sout에다가 넣어줘야 함.
        System.out.println(dto.getNumber());
        System.out.println(dto.getNumber());
        System.out.println(dto.getDept());
        System.out.println(dto.getJob());
        System.out.println(dto.getAge());
        System.out.println(dto.getGender());
        System.out.println(dto.getSalary());
        System.out.println(dto.getBonusPoint());
        System.out.println(dto.getPhone());
        System.out.println(dto.getAddress());


    }
}
