package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String name = sc.next();
        String dept = sc.next();
        String job = sc.next();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        int salary = sc.nextInt();
        double bonusPoint = sc.nextDouble();
        String phone = sc.next();
        String address = sc.next();
    }

    EmployeeDTO employee = new EmployeeDTO();

    public Application () {


    }




}
