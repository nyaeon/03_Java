package com.ohgiraffers.section02.package_and_import;

// 다른 패키지에 있는 Calculator 클래스를 사용하기 위해 임포트합니다.
// Calculator 클래스는 com.ohgiraffers.section01.method 패키지에 위치하고 있습니다.
import com.ohgiraffers.section01.method.Calculator; // Calculator 클래스 임포트

// static import를 사용하면 클래스 이름을 쓰지 않고 메서드를 직접 사용할 수 있습니다.
// 여기서는 Calculator 클래스에 있는 모든 static 메서드를 import 합니다.
import static com.ohgiraffers.section02.package_and_import.test.Calculator.*;  // test.Calculator 패키지에서 모든 static 메서드 임포트

public class Application_02 {
    public static void main(String[] args) {

        // non-static method 사용
        // Calculator 클래스를 사용하려면 먼저 객체를 만들어야 합니다.
        // 객체를 생성한 후, 객체를 통해 메서드를 호출합니다.
        Calculator cal = new Calculator(); // Calculator 객체를 생성
        int result = cal.plusTwoNumbers(10, 20); // plusTwoNumbers 메서드를 호출하여 두 수의 합을 구함
        System.out.println("result: " + result); // 결과를 출력

        // static method 사용
        // maxNumberOF 메서드는 static 메서드입니다.
        // static 메서드는 객체를 만들지 않고 바로 클래스 이름을 사용해서 호출할 수 있습니다.
        int result2 = maxNumberOF(10, 20); // maxNumberOF 메서드를 호출하여 두 숫자 중 더 큰 값을 구함
        System.out.println("result2 = " + result2); // 결과를 출력

        // 동명이 클래스가 다른 패키지에 있을 때는 패키지 이름을 명시적으로 써야 합니다.
        // 여기서는 com.ohgiraffers.section02.package_and_import.test 패키지에 있는 Calculator 클래스를 사용하고 있습니다.
        com.ohgiraffers.section02.package_and_import.test.Calculator car2
                = new com.ohgiraffers.section02.package_and_import.test.Calculator(); // 다른 패키지에 있는 Calculator 객체 생성

        // static import로 가져온 minNumberOF 메서드를 바로 호출하여 두 수 중 작은 값을 구함
        int result3 = minNumberOF(10, 20); // 두 숫자 중 작은 값을 구함
        System.out.println("result3 = " + result3); // 결과를 출력

        // static 메서드를 다시 호출하여 두 수 중 더 큰 값을 구함
        int result4 = maxNumberOF(10, 20); // 두 숫자 중 큰 값을 구함
        System.out.println("result4 = " + result4); // 결과를 출력
    }
}
