package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;  // 얘 덕분에 다른 패키지의 클래스를 풀네임이 아닌 Calculator로 쓸 수 있음

//    import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
//    import static com.ohgiraffers.section02.package_and_import.test.Calculator.minmaxNumberOf;
      import static com.ohgiraffers.section01.method.Calculator.*;
      import static com.ohgiraffers.section02.package_and_import.test.Calculator.*;

// import com.ohgiraffers.section02.package_and_import.test.Calculator; 다른 패키지에 같은 클래스 이름이면 둘 다 import 할 수 없음
public class Application2 {

    public static void main(String[] args) {


        // non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

        int result2 = cal.maxNumberOf(10, 20);
        System.out.println("result2 = " + result2);

        com.ohgiraffers.section02.package_and_import.test.Calculator cal2
                = new com.ohgiraffers.section02.package_and_import.test.Calculator() ;
        /*
        이렇게 패키지가 다르지만 클래스 이름이 같을 경우, 자주 쓰는 건 import문을 통해 짧은 클래스명을 쓰고
        잘 안 쓰는 건 풀네임을 써야 함
         */

        int result3 = com.ohgiraffers.section02.package_and_import.test.Calculator.maxNumberOf(10, 20);
        int result4 = minmaxNumberOf(10,20);
    }
}
