package com.greedy.level03.hard.emp.model.dto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDTO e = new EmployeeDTO();

        System.out.println("사원의 정보를 입력하세요");
        System.out.println("===================");
        System.out.print("번호: ");
        e.setNumber(sc.nextInt());
        System.out.print("사원명: ");
        e.setName(sc.next());
        System.out.print("부처: ");
        e.setDept(sc.next());
        System.out.print("직책: ");
        e.setJob(sc.next());
        System.out.print("나이: ");
        e.setAge(sc.nextInt());
        System.out.print("성별 (남/여): ");
        e.setGender(sc.next().charAt(0));
        System.out.print("금여: ");
        e.setSalary(sc.nextInt());
        System.out.print("보너스: ");
        e.setBonuspoint(sc.nextDouble());
        System.out.print("폰(-포함): ");
        e.setPhone(sc.next());
        System.out.print("주소(구까지): ");
        e.setAddress(sc.nextLine());
        sc.next();

        System.out.println(e.getNumber());
        System.out.println(e.getName());
        System.out.println(e.getDept());
        System.out.println(e.getJob());
        System.out.println(e.getAge());
        System.out.println(e.getGender());
        System.out.println(e.getSalary());
        System.out.println(e.getBonuspoint());
        System.out.println(e.getPhone());
        System.out.println(e.getAddress());
    }
}
