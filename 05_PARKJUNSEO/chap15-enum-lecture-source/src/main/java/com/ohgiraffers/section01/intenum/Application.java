package com.ohgiraffers.section01.intenum;

import com.sun.source.tree.Scope;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 정수 열거 패턴과 이의 단점을 확인
        int subject1 = Subject.JAVA;    // 0
        int subject2 = Subject.HTML;    // 0

        // (런타임 시점) 둘 다 같은 상수이자 숫자일 뿐 구분할 수 없다.
        // 실제로는 다른 과목인데
        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다.");
        }

        // 이름 충돌 방지를 위해서는 접두어를 써서 구분해야만 한다. (이름과 번호가 같을 때)
        // 변수명에 쓰인 이름 (문자열을 출력하기 어렵다. (feat.switch))
        Scanner sc = new Scanner(System.in);
        System.out.println("과목 번호를 눌러주세요(0~2) : ");
        int fieldNo = sc.nextInt();

        String subName = "";

        switch (fieldNo) {
            case Subject.JAVA: subName = "Java"; break;
            case Subject.MYSQL: subName = "MySQL"; break;
            case Subject.JDBC: subName = "JDBC"; break;
        }

        System.out.println("선택한 과목명은 : " + subName + "입니다.");

        // 같은 클래스에 속한 상수들을 순회(반목자/반복문) 할 수 없다 (필드가 총 몇 개고 어떤 필드들이 있는지)
        // 타입의 안정성을 보장할 수 없다.

        printSubjects(Subject.JAVA);    // 그냥 숫자의 개념도 허용이 된다.
        printSubjects(0);

    }


    private static void printSubjects (int subjectname) {}





}
