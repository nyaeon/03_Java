package com.greedy.level01.basic.member.model.dto;

public class Application1_2_1 {
    public static void main(String[] args) {
    StudentDTO num = new StudentDTO();
//    System.out.println("학년 :"+num.getGrade());
    num.setGrade(1);
  //  System.out.println("반 :"+num.getClassroom());
    num.setClassroom(2);
 //   System.out.println("이름 :"+num.getName());
    num.setName("길동이");
//    System.out.println("키 :"+num.getHeight());
    num.setHeight(175.5);
//    System.out.println("반 :"+num.getGender());
    num.setGender('남');
    System.out.println("학년 :"+num.getGrade());
    System.out.println("반 :"+num.getClassroom());
    System.out.println("이름 :"+num.getName());
    System.out.println("키 :"+num.getHeight());
    System.out.println("성별 :"+num.getGender());

    }
}
