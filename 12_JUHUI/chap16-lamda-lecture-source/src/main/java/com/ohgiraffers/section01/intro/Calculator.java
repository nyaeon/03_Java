package com.ohgiraffers.section01.intro;

/*
 * 자바에서는 메소드를 독립적으로 선언하는 것이 불가능하다.
 * 클래스나 인터페이스 내부에서만 선언되기 때문에 메소드를 가지는 클래스나 인터페이스가 필요하다.
 * 람다식은 그 중 인터페이스를 활용하게 된다.
 * 하지만 모든 인터페이스에 메소드를 작성한다고 람다식을 활용할 수 있는 것은 아니다.
 * 인터페이스 내부에 하나의 추상메소드가 선언된 인터페이스만 람다식의 타겟이 될 수 있다.
 * 이러한 인터페이스를 함수적 인터페이스(functional interface)라고 하며,
 * 해당 조건을 만족하는지를 컴파일 시점에 체크해주는 기능이 @FunctionalInterface 어노테이션이다.
 * */
//하나의 추상메소드만 람다식의 타겟이 될 수 있어 2개이상부터는 빨간 밑줄이 뜸.
@FunctionalInterface//이 인터페이스를 람다식으로 쓰겠다고 람다식의 타켓이라고 어노테이션 선언.
public interface Calculator {

    int sumTwoNumbers(int a, int b);

    //int minusTwoNumbers(int a, int b);
}
