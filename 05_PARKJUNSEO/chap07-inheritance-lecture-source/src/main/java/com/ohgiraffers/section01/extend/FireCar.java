package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar() {
        /*
        * 모든 생정자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
        * 부모의 기본 생성자를 호출하는 구문이다.
        * 명시적, 묵시적 전부 사용 가능하다.
        * */
        System.out.println("Fire Car 클래스의 기본 생성자 호출됨");
        // 자식 클래스의 기본생성자에는 부모 클래스의 생성자가 숨겨져 있음
    }
    /*
    * @Override 어노테이션
    * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러 발생.
    * (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
    * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 함
    * 그러나 재정의도 가능함
    * */
    @Override   // annotation : 이게 오버라이드라는 걸 알려줌
    public void soundHorn() {
        if(isRunning()) {
            System.out.println("삐뽀삐뽀삐뽀삐뽀삐뽀삐뽀삐뽀삐뽀삐뽀");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비켜주세요!");
        }
    }

    public void sprayWater() {
        System.out.println("물을 뿌립니다.");
    }
}
