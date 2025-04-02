package com.greedy.level03.hard.emp.model.dto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDTO dto = new EmployeeDTO();
        System.out.print("직원의 넘버는? : ");
        dto.setNumber(sc.nextInt());
        System.out.print("직원의 이름은? : ");
        dto.setName(sc.next());
        System.out.print("직원의 부서는? : ");
        dto.setDept(sc.next());
        System.out.print("직원의 직급은? : ");
        dto.setJob(sc.next());
        System.out.print("직원의 나이는? : ");
        dto.setAge(sc.nextInt());
        System.out.print("직원의 성별은? : ");
        dto.setGender(sc.next().charAt(0));
        System.out.print("직원의 연봉은? : ");
        dto.setSalary(sc.nextInt());
        System.out.print("직원의 보너스는? : ");
        dto.setBonusPoint(sc.nextDouble());
        System.out.print("직원의 전화번호는? : ");
        dto.setPhone(sc.next());
        System.out.print("직원의 주소는? : ");
        dto.setAddress(sc.nextLine());
        System.out.println(dto.getNumber());
        System.out.println(dto.getName());
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
