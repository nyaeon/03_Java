package com.ohgiraffers.h2.run;

import com.ohgiraffers.h2.model.dto.StudentDTO;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentDTO[] students = new StudentDTO[10];
    int cnt = 0;
    while(cnt<10) {
      System.out.println("학생을 추가하시겠습니까?");
      String input = sc.nextLine();
      if(!(input.equals("y")||input.equals("Y"))) {
        break;
      }
      students[cnt] = new StudentDTO();
      int grade = sc.nextInt();
      int classroom = sc.nextInt();
      String name = sc.next();
      int kor = sc.nextInt();
      int eng = sc.nextInt();
      int math = sc.nextInt();
      sc.nextLine();
      students[cnt].setGrade(grade);
      students[cnt].setClassroom(classroom);
      students[cnt].setName(name);
      students[cnt].setKor(kor);
      students[cnt].setEng(eng);
      students[cnt++].setMath(math);
    }

    for(int i=0;i<3;i++){
      double avg = (double)(students[i].getKor()+students[i].getEng()+students[i].getMath())/3;
      System.out.println(students[i].information() + " 평균은 "+(int)(avg)+"점 입니다.\n");
    }
  }
}
