package com.ohgiraffers.section01.intro;

public class Application {
    public static void main(String[] args) {
        /***
         * 람다식에서 매개변수의 타입은 추론이 가능하기 때문에 명시적으로 작성하지 않아도 됨
         * 또한 매개변수가 한개만 존재하는 경우()를 생략할 수 있으며, 실행문이 한줄인 경우
         * {}는 생략 가능함
         */
        /***
         * 인터페이스에 정의된 추상메소드를 활용
         * 1.인터페이스를 상속받은 클래스를 정의히여 기능을 완성 후 사용하는 방법
         *
         */
        Calculator c1 = new CalculatorImpl();
        System.out.println("10과 20의 합은 :  " + (c1.sumTwonumber(10, 20)));
        /***
         * 2.익명 클래스를 활용하여 메소드 제정의 후 사용하는 방법
         */
        Calculator c2 = new Calculator(){

            @Override
            public int sumTwonumber(int a, int b) {
                return a + b;
            }
        };
        System.out.println("10과 20의 합은 :  " + (c2.sumTwonumber(10, 20)));
        /***
         * 3.람다식을 활용하는 방법
         */
        Calculator c3 = (x,y) -> x + y;
        System.out.println("10과 20의 합 :  " + (c3.sumTwonumber(10, 20)));

    }
}
