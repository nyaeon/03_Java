package com.ohgiraffers.section02.package_and_import;
// import 등록을 생략해도 사용가능한 패키지가 있는데, java-lang패키지를 의미한다.
// 워낙 기본이되는 패키지이다보니, 생략해도 컴파일러가 알아서 실행할때 추가해준다.

import com.ohgiraffers.section01.method.Calculator;

//import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
//import static com.ohgiraffers.section01.method.Calculator.minNumberOf;
import static com.ohgiraffers.section01.method.Calculator.*;


public class Application2 {

    public static void main(String[] args) {

        // non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

        int result2 = maxNumberOf(10, 20);
        System.out.println("result2 = " + result2);

        com.ohgiraffers.section02.package_and_import.test.Calculator calculator = new com.ohgiraffers.section02.package_and_import.test.Calculator();

        int result3 = maxNumberOf(10, 20);
        int result4 = minNumberOf(20, 30);
    }
}
