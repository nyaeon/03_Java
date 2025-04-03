package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO emp = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        emp.setNumber(number);
        sc.nextLine();

        String name = sc.nextLine();
        emp.setName(name);

        String dept = sc.nextLine();
        emp.setDept(dept);

        String job = sc.nextLine();
        emp.setJob(job);

        int age = sc.nextInt();
        emp.setAge(age);
        sc.nextLine();


        char gender = sc.next().charAt(0);
        emp.setGender(gender);

        int salary = sc.nextInt();
        emp.setSalary(salary);

        double bonusPoint = sc.nextDouble();
        emp.setBonusPoint(bonusPoint);
        sc.nextLine();

        String phone = sc.nextLine();
        emp.setPhone(phone);

        String address = sc.nextLine();
        emp.setAddress(address);

        System.out.println(emp.getNumber());
        System.out.println(emp.getName());
        System.out.println(emp.getDept());
        System.out.println(emp.getAge());
        System.out.println(emp.getGender());
        System.out.println(emp.getSalary());
        System.out.println(emp.getBonusPoint());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAddress());


    }
}
