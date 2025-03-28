package com.ohgiraffers.section01.method;

public class Application_03 {

    static int global = 10; // 클래스 변수 (Static 변수) - 모든 객체가 공유하는 변수
    // 이 변수는 클래스 이름을 통해 직접 접근할 수 있습니다.

    public static void main(String[] args) {

        int local = 20; // 지역 변수 (Local 변수) - 해당 메서드 내에서만 사용 가능한 변수

        // 전역 변수(global)와 지역 변수(local) 값을 출력
        System.out.println("global = " + global); // 전역 변수(global)를 출력
        System.out.println("local = " + local);   // 지역 변수(local)를 출력

        // 객체 생성 후 testMethod 호출
        Application_03 app = new Application_03(); // Application_03 객체 생성
        app.testMethod(3 * 9); // 3 * 9 연산 결과인 27을 testMethod에 전달하여 호출

        // 아래 주석 처리된 코드들은 다양한 형태로 메서드를 호출한 예시입니다.
        // app.testMethod(13);  // 정수 13을 전달
        // app.testMethod(global); // 전역 변수(global)를 전달
        // app.testMethod('a'); // 문자 'a'를 전달 (이 문자는 정수로 자동 변환됨)
        // app.testMethod((int) 12.34); // 12.34를 정수로 변환 후 전달
    }

    public static void test() {
        // static 메서드는 객체 생성 없이 클래스 이름을 통해 호출할 수 있습니다.
    }

    /***
     *  정수형 나이를 주면 문자열을 출력해주는 기능
     * @param age 나이 (정수형)
     */
    public void testMethod(int age) {
        // testMethod는 나이를 받아서 출력하는 메서드입니다.
        System.out.println("Your age is: " + age + " years old");
    }
}
