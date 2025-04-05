package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeDTO employee = new EmployeeDTO();

        System.out.print("사번: ");
        employee.setNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("이름: ");
        employee.setName(scanner.nextLine());

        System.out.print("부서: ");
        employee.setDept(scanner.nextLine());

        System.out.print("직급: ");
        employee.setJob(scanner.nextLine());

        System.out.print("나이: ");
        employee.setAge(scanner.nextInt());

        System.out.print("성별(남/여): ");
        employee.setGender(scanner.next().charAt(0));

        System.out.print("급여: ");
        employee.setSalary(scanner.nextInt());

        System.out.print("보너스 포인트: ");
        employee.setBonusPoint(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("전화번호: ");
        employee.setPhone(scanner.nextLine());

        System.out.print("주소: ");
        employee.setAddress(scanner.nextLine());

        scanner.close();

        System.out.println("\n===== 직원 정보 =====");
        System.out.println(employee.getNumber());
        System.out.println(employee.getName());
        System.out.println(employee.getDept());
        System.out.println(employee.getJob());
        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonusPoint());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress());
    }
}

