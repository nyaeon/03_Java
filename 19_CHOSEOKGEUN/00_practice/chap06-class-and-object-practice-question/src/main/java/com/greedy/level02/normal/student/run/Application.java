package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학년 입력: ");
        int grade = scanner.nextInt();
        System.out.print("반 입력: ");
        int classroom = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름 입력: ");
        String name = scanner.nextLine();
        System.out.print("키 입력: ");
        double height = scanner.nextDouble();
        System.out.print("성별 입력(남:M, 여:F): ");
        char gender = scanner.next().charAt(0);

        StudentVO student = new StudentVO(grade, classroom, name, height, gender);
        System.out.println("");
        student.printInformation();
    }
}