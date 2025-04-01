package com.greedy.level03.hard.emp.model.dto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDTO dto = new EmployeeDTO();
        System.out.print("직원의 넘버는? : ");
        dto.setNumber(sc.nextInt());
        System.out.print("직원의 이름은? : ");
        dto.setName(sc.nextLine());
        System.out.print("직원의 부서는? : ");
        dto.setDept(sc.nextLine());
        System.out.print("직원의 직급은? : ");
        dto.setJob(sc.nextLine());
        System.out.print("직원의 나이는? : ");
        dto.setAge(sc.nextInt());
        System.out.print("직원의 성별은? : ");
        dto.setGender(sc.nextLine().charAt(0));
        System.out.print("직원의 연봉은? : ");
        dto.setSalary(sc.nextInt());
        System.out.println("직원의 보너스는? : ");
        dto.setBonusPoint(sc.nextDouble());
        System.out.print("직원의 전화번호는? : ");
        dto.setPhone(sc.nextLine());
        System.out.print("직원의 주소는? : ");
        dto.setAddress(sc.nextLine());
        System.out.println(dto.getName());
    }
}
