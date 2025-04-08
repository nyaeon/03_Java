package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
    public FireCar() {
        /*
        * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
        * 부모의 기본생성자를 호출하는 구문이다.
        * 명시적, 묵시적 전부 사용가능하다.
        * */
        super(); // => Car() 생성자
        System.out.println("FireCar 클래스의 기본생성자 호출됨...");
    }

    /**
     * @Override 어노테이션
     * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하며 성립되지 않는 경우 컴파일 에러를 발생시킨다.
     * (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
     * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
     */
    @Override
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("소방차 - 빠ㅏㅏㅏㅏㅏㅏㅏㅏㅏ앙");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없음");
        }
    }

    public void sprayWater() {
        System.out.println("불남 물뿌려 🐳");
    }

    // 부모 해시코드 확인
    public void superHashcode() {
        System.out.println(super.hashCode());
    }
}
