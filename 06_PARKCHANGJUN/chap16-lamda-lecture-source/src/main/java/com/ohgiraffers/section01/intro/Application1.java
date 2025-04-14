package com.ohgiraffers.section01.intro;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 람다식에서 매개변수의 타입은 추론이 가능하기 때문에 명시적으로 작성하지 않아도 된다.
         * 또한 매개변수가 한개만 존재하는 경우()를 생략할 수 있으며, 실행문이 한줄 인 경우
         * {}는 생략 가능하다.
         */

        /*
         * 인터페이스에 정의된 추상메소드를 활용
         * 1. 인터페이스를 상속받은 클래스를 정의하여 기능을 완성 후 사용하는 방법
         */
        Calculator cl = new CalculatorImpl();
        System.out.println("===== cl.subTwoNumber =====");
        System.out.println("10과 20의 합은 : " + (cl.subTwoNumber(10, 20)));

        /* 2. 익명클래스를 활용하여 메소드 재정의 후 사용하는 방법 */
        // 인터페이스는 생성장의 대한 것이 없으니 오류
//        Calculator cl2 = new Calculator();
        Calculator cl2 = new Calculator() {

            @Override
            public int subTwoNumber(int a, int b) {
                return a + b;
            }
        };
        // {} 안은 클래스

        System.out.println("===== cl2.subTwoNumber =====");
        System.out.println("10과 20의 합은 : " + (cl2.subTwoNumber(10, 20)));

        /*
         public int subTwoNumber(int a, int b) {
               return a + b;
           }
           이걸 축약해서 쓴 방법이 (x, y) -> x + y
         */

        /* 람다식을 활용하는 방법 */
//        Calculator cl3 = (x, y) -> {
//            return x + y;
//        }; 원래는 이 소스. 하나의 값만 가져오기 때문에 생략 가능.
        Calculator cl3 = (x, y) -> x + y;
//        Calculator cl3 = (test1, test2) -> test1 + test2; // 이렇게 써도 무방. 이름일 뿐이다.
        System.out.println("===== cl3.subTwoNumber =====");
        System.out.println("10과 20의 합은 : " + cl3.subTwoNumber(10, 20));
    }
}
