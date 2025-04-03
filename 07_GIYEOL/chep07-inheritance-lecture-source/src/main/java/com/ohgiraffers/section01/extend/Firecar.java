package com.ohgiraffers.section01.extend;

public class Firecar extends Car {
    public Firecar() {
        /***
         * 모든 생성자에는 맨 첫줄에 super()를 컴파일러가 자동추가
         * 부모의 기본생성자를 호출하는 생성자
         * 명시적,묵시적 모두 가능
         */
        System.out.println("firecar 클래스의 기본 생성자 호출");
    }
    //메소드 오버라이딩:부모 객체와 이름은 같지만 하위 객체에서 메소드를 제정의 함
    //메소다 오버로딩: 메소드 이름은 같지만, 시그니처를 다르게 여려개 생성

    /***
     * @override 어노테이션
     * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하며 성립되지 않는 경우 컴파일 에러 발생
     * 오버라이딩이 정상적으로 작성된지 확인
     * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 함
     */
    @Override
    public void sound() {
        if(isrunning()){
            System.out.println("BAAAAAAAAAAAAAAAAAAANG");
        }else {
            System.out.println("앞으로 갈 수 없다");
        }
    }
    public void water(){
        System.out.println("하이드로 펌프");
    }
}
