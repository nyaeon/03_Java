package com.ohgiraffers.section02.package_and_import;
<<<<<<< HEAD
// import 등록을 생략해도 사용가능한 패키지가 있는데, java.lang패키지를 의미한다.
// 워낙 기본이되는 패키지이다보니, 생략해도 컴파일러가 알아서 실행할때 추가해준다.
public class Application1 {

=======

public class Application1 {
>>>>>>> a8fb790 (수정4)
    public static void main(String[] args) {

        com.ohgiraffers.section01.method.Calculator cal
                = new com.ohgiraffers.section01.method.Calculator();

        int plusResult = cal.plusTwoNumbers(100, 50);
        System.out.println("100과 50의 합은? " + plusResult);

<<<<<<< HEAD
        int maxResult = com.ohgiraffers.section01.method.Calculator.maxNumberOf(100, 50);
        System.out.println("두 수 중에 큰 수는 : " + maxResult);
=======
        int maxResult = cal.maxNumberOf(100, 50);
        System.out.println("두 수 중에 큰 수는 ? " + maxResult);
>>>>>>> a8fb790 (수정4)
    }
}
