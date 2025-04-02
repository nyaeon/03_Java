package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar() {
        /**
         * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
         * 부모의 기본생성자를 호출하는 구문이다.
         * 명시적, 묵시적 전부 사용가능하다.
         */

        super();
        // 상속을 하는순간 super가 들어온다.
        // 자식클래스의 내용은 부모클래스와 같이 생성됨
        System.out.println("Fire Car 클래스의 기본생성자 호출됨...");
    }

    // 재정의한다. 라는 말은 오버라이딩. 조건 : 상속이 선행되어야 한다.
    // 부모한테 상속받으면 내맘대로 쓸 수 있다. 내 맘대로 변경 가능
    // 오버로딩(overloading) : 같은 클래스내에 동일한 메소드명을 사용 하려면 매개변수의 갯수, 타입, 순서를 다르게하면 다른 메소드로 인식하게 만드는 기술
    // 메소드시그니처 soundHorn()
    // 오버라이딩(overriding) : 부모가 가진 걸 내껄로 쓰는 것

    /**
     * @Override 어노테이션
     * JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
     * (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
     * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
     */
    // 배열의 타입은 그대로 쓴다
    @Override // 나 부모걸 재정의 했어요 라는 뜻. @ : 어노테이션. 이걸 해주면 그거에 대한 내용들의 지표를 만들어준다는 뜻
    public void soundHorn() {
        // private 일때 컴파일 에러, private를 protected로 바꾸면 에러 없어짐
        // private 일때는 부모가 안준다 라고 생각하면 된다.
        if(isRunning()) {
            System.out.println("빠아아아아아아아앙 ~~~~빠아아아아아아아앙!!!!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다!!! 비키세요 비켜~~~~~~~~~");
        }
    }
    // 부모꺼 말고 자기 자신에 더 추가할 수 있다.
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. ==============>>>>>>>>>>>>>>");
    }

}
