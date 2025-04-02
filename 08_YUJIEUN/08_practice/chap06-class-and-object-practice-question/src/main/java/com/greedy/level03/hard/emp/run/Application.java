package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //스캐너를 이용해서 모든 직원 정보를 입력 받아
        //기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경 후
        //getter를 이용하여 모든 필드 값 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("직원 번호 입력: ");
        int number = sc.nextInt();
        System.out.print("이름 입력: ");
        String name = sc.next();
        System.out.print("부서 입력: ");
        String dept = sc.next();
        System.out.print("직무 입력: ");
        String job = sc.next();
        System.out.print("나이 입력: ");
        int age = sc.nextInt();
        System.out.print("성별 입력(남/여): ");
        char gender = sc.next().charAt(0);
        System.out.print("급여 입력: ");
        int salary = sc.nextInt();
        System.out.print("보너스 포인트 입력: ");
        double bonus = sc.nextDouble();
        System.out.print("전화번호 입력: ");
        String phone = sc.next();
        System.out.print("주소 입력: ");
        String address = sc.next();

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setNumber(number);
        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBonus(bonus);
        employeeDTO.setPhone(phone);
        employeeDTO.setAddress(address);

        System.out.println("직원 번호 : " + employeeDTO.getNumber());
        System.out.println("이름 : " + employeeDTO.getName());
        System.out.println("부서 : " + employeeDTO.getDept());
        System.out.println("직무 : " + employeeDTO.getJob());
        System.out.println("나이 : " + employeeDTO.getAge());
        System.out.println("성별 : " + employeeDTO.getGender());
        System.out.println("급여 : " + employeeDTO.getSalary());
        System.out.println("보너스 포인트 : " + employeeDTO.getBonus());
        System.out.println("전화번호 : " + employeeDTO.getPhone());
        System.out.println("주소 : " + employeeDTO.getAddress());

        sc.close();



    }
}
