package com.ohgiraffers.section01.inteum;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 정수 열거 패턴과 이의 단점을 확인
        int subsect1 = Subjects.JAVA;
        int subsect2 = Subjects.HTML;

        // 둘 다 같은 상수이자 숫자일 뿐 구분할 수 없다. 언제 : 런타임 시점
        if(subsect1 == subsect2) {
            System.out.println("if(subsect1 == subsect2) : " + "두 과목은 같은 과목이다.");
        }

        // 이름 충돌 방지를 위해서는 접두어를 써서 구분해야만 한다. (이름과 번호가 같을때)
        // 변수명에 쓰인 이름(문자열을 출력하기 어렵다. (feat.switch)
        Scanner sc = new Scanner(System.in);
        System.out.println("과목 번호를 눌러주세요(0 ~ 2) : ");
        int fieldNo = sc.nextInt();

        String subName = "";
        switch (fieldNo) {
            case Subjects.JAVA: subName = "JAVA"; break;
            case Subjects.MYSLQL: subName = "MYSQL"; break;
            case Subjects.JDBC: subName = "JDBC"; break;

        }

        System.out.println("선택한 과목명은 : " + subName + "입니다.");


        // 같은 클래스에 속한 상수들을 순회(반복자/반복문)할 수 없다.
        // (필드가 총 몇 개고 어떤 필드들이 있는지)
        // 타입 안정성을 보장할 수 없다.
        printSubjects(Subjects.JAVA);
        printSubjects(0); // 그냥 숫자의 개념도 허용이된다.
    }

    private static void printSubjects(int subjectName) {}
}

