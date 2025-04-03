package com.greedy.level03.hard.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDTO ET = new EmployeeDTO();
        System.out.println("Employee Number : " );
        ET.setNumber(sc.nextInt());
        System.out.println("Employee Name : ");
        ET.setName(sc.next());
        System.out.println("Employee Dept : ");
        ET.setDept(sc.next());
        System.out.println("Employee Job : ");
        ET.setJob(sc.next());
        System.out.println("Employee Age : ");
        ET.setAge(sc.nextInt());
        System.out.println("Employee Gender : ");
        ET.setGender(sc.next().charAt(0));
        System.out.println("Employee Salary : ");
        ET.setSalary(sc.nextInt());
        System.out.println("Employee Bouns Point : ");
        ET.setBounsPoint(sc.nextDouble());
        System.out.println("Employee Phone : ");
        ET.setPhone(sc.next());
        System.out.println("Employee Address : ");
        ET.setAddress(sc.next());

        System.out.println(ET.getNumber());
        System.out.println(ET.getName());
        System.out.println(ET.getDept());
        System.out.println(ET.getJob());
        System.out.println(ET.getAge());
        System.out.println(ET.getGender());
        System.out.println(ET.getSalary());
        System.out.println(ET.getBounsPoint());
        System.out.println(ET.getPhone());
        System.out.println(ET.getAddress());
    }
}
