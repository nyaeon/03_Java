package com.greedy.level02.normal.student.model.vo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVO stu = new StudentVO();
        System.out.print("학년을 입력하세요 : ");
        int grade = sc.nextInt();
        System.out.print("반을 입력하세요 : ");
        int classs = sc.nextInt();
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        stu.setGrade(grade);
        stu.setClassroom(classs);
        stu.setName(name);
        stu.setHeight(height);
        stu.setGender(gender);
        stu.printInformation();
    }
}
