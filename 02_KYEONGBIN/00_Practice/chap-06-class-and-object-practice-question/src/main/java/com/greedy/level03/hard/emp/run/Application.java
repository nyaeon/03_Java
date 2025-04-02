package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO dto = new EmployeeDTO();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        dto.setNumber(scanner.nextInt());
        System.out.println("Enter name: ");
        dto.setName(scanner.next());
        System.out.println("Enter department: ");
        dto.setDept(scanner.next());
        System.out.println("Enter job title: ");
        dto.setJob(scanner.next());
        System.out.println("Enter age");
        dto.setAge(scanner.nextInt());
        System.out.println("Enter salary: ");
        dto.setSalary(scanner.nextInt());
        System.out.println("Enter bonus points");
        dto.setBonusPoint(scanner.nextInt());
        System.out.println("Enter phone number: ");
        dto.setPhone(scanner.next());
        System.out.println("Enter address: ");
        dto.setAdress(scanner.next());

        System.out.println("-----------------------------------------------------------");

        System.out.println("Your number is: " + dto.getNumber());
        System.out.println("Your name is: " + dto.getName());
        System.out.println("Your department is: " + dto.getDept());
        System.out.println("Your job title is: " + dto.getJob());
        System.out.println("Your age is: " + dto.getAge());
        System.out.println("Your salary is: " + dto.getSalary());
        System.out.println("Your bonus points is: " + dto.getBonusPoint());
        System.out.println("Your phone number is: " + dto.getPhone());
        System.out.println("Your address is: " + dto.getAdress());

        System.out.println("-----------------------------------------------------------");



        /* Result

        -----------------------------------------------------------
        Your number is: 1
        Your name is: bini
        Your department is: D1
        Your job title is: Designer
        Your age is: 31
        Your salary is: 5100000
        Your bonus points is: 4000000.0
        Your phone number is: 010-1234-5678
        Your address is: Korea
        -----------------------------------------------------------

         */


    }

}
