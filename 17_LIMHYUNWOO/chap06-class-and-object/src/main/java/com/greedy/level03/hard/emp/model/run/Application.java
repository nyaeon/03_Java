package com.greedy.level03.hard.emp.model.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO ed = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);
        int number   = sc.nextInt();
        String name   = sc.next();
        String dept   = sc.next();
        String job  = sc.next();
        int age = sc.nextInt();
        char gender  = sc.next().charAt(0);
        int salary = sc.nextInt();
        double bonus = sc.nextDouble();
        String phone = sc.next();
        sc.nextLine();
        String address = sc.nextLine();
        ed.setNumber(number);
        ed.setName(name);
        ed.setDept(dept);
        ed.setJob(job);
        ed.setAge(age);
        ed.setGender(gender);
        ed.setSalary(salary);
        ed.setBonusPoint(bonus);
        ed.setPhone(phone);
        ed.setAddress(address);
        System.out.println(ed.getNumber());
        System.out.println(ed.getName());
        System.out.println(ed.getDept());
        System.out.println(ed.getJob());
        System.out.println(ed.getAge());
        System.out.println(ed.getGender());
        System.out.println(ed.getSalary());
        System.out.println(ed.getBonusPoint());
        System.out.println(ed.getPhone());
        System.out.println(ed.getAddress());

    }
}
