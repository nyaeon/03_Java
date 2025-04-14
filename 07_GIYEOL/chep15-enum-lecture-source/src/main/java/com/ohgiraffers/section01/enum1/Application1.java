package com.ohgiraffers.section01.enum1;

public class Application1 {}
//    public static void main(String[] args) {
//    //정수 열거 패턴과 이의 단점을 확인
//    int subject1 = Subjects.JAVA;
//    int subject2 = Subjects.HTML;
//    // 둘 다 같은 상수이지 숫자일 뿐 구분할 수 없다 (런타임 시점)
//            if(subject1 == subject2){
//        println("두과목은 같은 과목이다")
//    }
//    // 이름 충돌 방지를 위해서는 접두어를 써서 구분해야만 한다( 이름과 번호가 같을 때)
//    //변수명에 쓰인 이름(문자열을 출력하기 어렵다(feat.swich)
//
//    Scanner sc = new Scanner(System.in);
//            System.out.println("과목 번호를 눌러주세요(0~2)");
//    int fieldNo = sc.nextInt();
//
//    String subName = " ";
//    swith(fieldNo){
//        case Subjects.JAVA:subName = "JAVA";  break;
//        case Subjects.MYSQL:subName = "MYSQL";  break;
//        case Subjects.JDBC:subName = "jDBC";  break;
//    }
//            System.out.println("선택과 목 : " + subName + "임");
//    //같은 클래스에 속한 상수들을 순회 (반복자/반복문) 할 수 없다 (필드가 총 몇개고 어떤 필드들이 있는지)
//    //타입의 안정성 보장이 어렵
//    printSubjects(Subjects.JAVA);
//    printSubjects(0);//그냥 숫자의 개념도 허용이 됨
//}}

