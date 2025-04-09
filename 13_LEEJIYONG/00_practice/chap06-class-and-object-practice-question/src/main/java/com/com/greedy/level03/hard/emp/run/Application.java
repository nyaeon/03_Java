package com.com.greedy.level03.hard.emp.run;

import com.com.greedy.level03.hard.emp.model.dto.EmployeeDTO;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number : ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("name : ");
        String name = sc.nextLine();
        System.out.print("dept : ");
        String dept = sc.nextLine();
        System.out.print("job : ");
        String job = sc.nextLine();
        System.out.print("age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("gender : ");
        char gender = sc.nextLine().charAt(0);
        System.out.print("salary : ");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.print("bonusPoint : ");
        double bonusPoint = sc.nextDouble();
        sc.nextLine();
        System.out.print("phone : ");
        String phone = sc.nextLine();
        System.out.print("address : ");
        String address = sc.nextLine();

        EmployeeDTO dto = new EmployeeDTO();
        dto.setNumber(number);
        dto.setName(name);
        dto.setDept(dept);
        dto.setJob(job);
        dto.setAge(age);
        dto.setGender(gender);
        dto.setSalary(salary);
        dto.setBonusPoint(bonusPoint);
        dto.setPhone(phone);
        dto.setAddress(address);

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
