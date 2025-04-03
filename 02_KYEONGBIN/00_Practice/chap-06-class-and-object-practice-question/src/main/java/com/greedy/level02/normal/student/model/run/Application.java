package com.greedy.level02.normal.student.model.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentVO studentVO = new StudentVO();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your student's grade: ");
        studentVO.setGrade(scanner.nextInt());
        System.out.println("Please enter your student's classroom: ");
        studentVO.setClassRoom(scanner.nextInt());
        System.out.println("Please enter your student's name: ");
        studentVO.setName(scanner.next());
        System.out.println("Please enter your student's height: ");
        studentVO.setHeight(scanner.nextDouble());
        System.out.println("Please enter your student's gender: (남/여) ");
        studentVO.setGender(scanner.next().charAt(0));


        System.out.println(studentVO);




    }
}
