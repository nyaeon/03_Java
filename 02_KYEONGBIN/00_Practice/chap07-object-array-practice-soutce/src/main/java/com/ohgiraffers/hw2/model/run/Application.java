package com.ohgiraffers.hw2.model.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        StudentDTO[] students = new StudentDTO[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < 10) {
            students[i] = new StudentDTO();

            System.out.println("Enter the grade: ");
            students[i].setGrade(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Enter the classroom: ");
            students[i].setClassroom(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Enter the name: ");
            students[i].setName(scanner.nextLine());

            System.out.println("Enter the kor point: ");
            students[i].setKor(scanner.nextInt());

            System.out.println("Enter the eng point: ");
            students[i].setEng(scanner.nextInt());

            System.out.println("Enter the math point: ");
            students[i].setMath(scanner.nextInt());

            System.out.println("Current student data: ");


            System.out.println("Do you want to continue? (Y/N)");
            scanner.nextLine();
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                i++;
            } else if (answer.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Wrong answer. Try again.");
            }
        }

        System.out.println("\nAll students data:");
        for (StudentDTO student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }

        System.out.println("\nAverage points: :");
        for (StudentDTO student : students) {
            if (student != null) {
                System.out.println(student + "\n" +  student.getName() + " 님의 평균 점수는: " + student.averagePoints() + "점 입니다. \n");
            }
        }

        scanner.close();

    }
}


//package com.ohgiraffers.hw2.model.run;

//import com.ohgiraffers.hw2.model.dto.StudentDTO;
//
//
//import java.util.Scanner;
//
//
//public class Application {
//    public static void main(String[] args) {
//
//        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
//        // while문을 사용하여 학생들의 정보를 계속 입력 받고
//        // 한 명씩 추가 될 때마다 카운트함
//        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
//        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
//        // 현재 기록된 학생들의 각각의 점수 평균을 구함
//        // 학생들의 정보를 모두 출력 (평균 포함)
//
//        Scanner sc = new Scanner(System.in);
//
//        StudentDTO[] stu = new StudentDTO[10];
//
//        int count = 0;
//        while (true) {
//
//            System.out.println("학년을 입력하세요 : ");
//            int grade = sc.nextInt();
//            System.out.println("반을 입력하세요 : ");
//            int classroom = sc.nextInt();
//            System.out.println("이름을 : 입력하세요 :");
//            String name = sc.next();
//            System.out.println("국어 성적을 입력하세요 : ");
//            int kor = sc.nextInt();
//            System.out.println("영어 성적을 입력하세요 : ");
//            int eng = sc.nextInt();
//            System.out.println("수학 성적을 입력하세요 : ");
//            int math = sc.nextInt();
//            stu[count++] = new StudentDTO(grade, classroom, name, kor, eng, math);
//            System.out.println("계속 추가 하실겁니까? : y/n");
//            char answer  = sc.next().charAt(0);
//            if (answer == 'y') {
//                continue;
//            } else {
//                break;
//            }
//        }
//
//        for (StudentDTO s : stu) {
//            if (s != null) {
//                System.out.println(s.information());
//                int sum = s.getKor()+s.getEng()+s.getMath();
//                System.out.println("학생들의 평균은 : " + sum / 3);
//            }
//        }
//    }
//}