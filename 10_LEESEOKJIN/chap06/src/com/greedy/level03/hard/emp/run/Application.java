package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        try {
            var br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter number: ");
            int number = Integer.parseInt(br.readLine());
            System.out.print("Enter name: ");
            String name = br.readLine();
            System.out.print("Enter dept: ");
            String dept = br.readLine();
            System.out.print("Enter job: ");
            String job = br.readLine();
            System.out.print("Enter age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Enter gender: ");
            char gender = br.readLine().charAt(0);
            System.out.print("Enter salary: ");
            int salary = Integer.parseInt(br.readLine());
            System.out.print("Enter bonus point: ");
            double bonusPoint = Double.parseDouble(br.readLine());
            System.out.print("Enter phone: ");
            String phone = br.readLine();
            System.out.print("Enter address: ");
            String address = br.readLine();

            var emp = new EmployeeDTO();
            emp.setNumber(number);
            emp.setName(name);
            emp.setDept(dept);
            emp.setJob(job);
            emp.setAge(age);
            emp.setGender(gender);
            emp.setSalary(salary);
            emp.setBonusPoint(bonusPoint);
            emp.setPhone(phone);
            emp.setAddress(address);

            System.out.println(emp.getNumber());
            System.out.println(emp.getName());
            System.out.println(emp.getDept());
            System.out.println(emp.getJob());
            System.out.println(emp.getAge());
            System.out.println(emp.getGender());
            System.out.println(emp.getSalary());
            System.out.println(emp.getBonusPoint());
            System.out.println(emp.getPhone());
            System.out.println(emp.getAddress());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
