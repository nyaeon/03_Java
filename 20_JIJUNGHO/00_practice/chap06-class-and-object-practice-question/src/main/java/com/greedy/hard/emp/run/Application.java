package com.greedy.hard.emp.run;

import com.greedy.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);
        System.out.print("사원번호 : ");
        employeeDTO.setNumber(sc.nextInt());
        System.out.print("이름 : ");
        employeeDTO.setName(sc.next());
        System.out.print("부서 : ");
        employeeDTO.setDept(sc.next());
        System.out.print("직급 : ");
        employeeDTO.setJob(sc.next());
        System.out.print("나이 : ");
        employeeDTO.setAge(sc.nextInt());
        System.out.print("성별 : ");
        employeeDTO.setGendder(sc.next().charAt(0));
        System.out.print("월급 : ");
        employeeDTO.setSalary(sc.nextInt());
        System.out.print("보너스 포인트 : ");
        employeeDTO.setBonusPoint(sc.nextDouble());
        System.out.print("전화번호 : ");
        employeeDTO.setPhone(sc.next());
        sc.nextLine();
        System.out.print("주소 : ");
        employeeDTO.setAddress(sc.nextLine());

        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGendder());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBonusPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());

    }
}
