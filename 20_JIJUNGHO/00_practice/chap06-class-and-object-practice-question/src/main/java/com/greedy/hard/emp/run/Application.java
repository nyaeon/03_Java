package com.greedy.hard.emp.run;

import com.greedy.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO dto = new EmployeeDTO();

        Scanner sc = new Scanner(System.in);
        System.out.print("사원코드를 입력하세요 : ");
        dto.setNumber(sc.nextInt());
        System.out.print("사원명을 입력하세요 : ");
        dto.setName(sc.next());
        System.out.print("부서명을 입력하세요 : ");
        dto.setDept(sc.next());
        System.out.print("직급명을 입력하세요 : ");
        dto.setJob(sc.next());
        System.out.print("나이를 입력하세요 : ");
        dto.setAge(sc.nextInt());
        System.out.print("성별을 입력하세요 : ");
        dto.setGendder(sc.next().charAt(0));
        System.out.print("연봉을 입력하세요 : ");
        dto.setSalary(sc.nextInt());
        System.out.print("보너스포인트를 입력하세요 : ");
        dto.setBonusPoint(sc.nextDouble());
        System.out.print("전화번호를 입력하세요 : ");
        dto.setPhone(sc.next());
        System.out.print("주소를 입력하세요 : ");
        dto.setAddress(sc.next());

        System.out.println(dto.getNumber());
        System.out.println(dto.getName());
        System.out.println(dto.getDept());
        System.out.println(dto.getJob());
        System.out.println(dto.getAge());
        System.out.println(dto.getGendder());
        System.out.println(dto.getSalary());
        System.out.println(dto.getBonusPoint());
        System.out.println(dto.getPhone());
        System.out.println(dto.getAddress());




    }
}
