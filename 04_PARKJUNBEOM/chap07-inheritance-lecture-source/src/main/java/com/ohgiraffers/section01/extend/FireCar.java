package com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    public FireCar() {
        /*
        * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
        * 부모의 기본 생성자를 호출하는 구분이다.
        * 명시적, 묵시적 전부 사용가능하다.
        * */
        super();
        System.out.println("FireCar 클래스의 기본생성자 호출됨 ...");

    }
    /*
    * @Override 어노테이션
    * jDK 1.5부터 추가된 무넙으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
    * (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
    * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
    * */
    // 오버라이딩(상속)
    @Override
    public void soundHorn() {

        if(isRunning()) {
            System.out.println("빠아아아아아앙 ~~ 빠아아아아아앙!!!!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다!!! 비키세요 비켜 ~~~~~");
        }
    }
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ============>>>>>>>>");
    }
}
