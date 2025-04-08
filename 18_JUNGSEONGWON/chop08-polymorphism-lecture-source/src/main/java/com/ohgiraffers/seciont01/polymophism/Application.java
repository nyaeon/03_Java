package com.ohgiraffers.seciont01.polymophism;

public class Application {

    public static void main(String[] args) {

        /*
        * 다형성
        * 다형성이란 하나의 인스터스가 여러 가지 타입을 가질 수 있다는 것을 의미한다.
        * */
        System.out.println("Animal 생성==========================");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("Rabbit 생성==========================");
        Rabbit rabbit = new Rabbit(); // 객체 생성
        rabbit.eat(); // 오버라이딩한 거 가지고 온거
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("Tiger 생성==========================");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();


        /*
        * Rabbit 과 Tiger는 Animal 클래스를 상속 받았다.
        *
        * Rabbiit은 Rabbit 타입이기도 하면서 Animal 타입이기도 한다다.
        * Tiger는 Tiger 타입이기도 하면서 Animal 타입이기도 한다
        * */

        // 부모 타입으로 자식 인스턴스 주소값 저장
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger(); // 토끼 호랑이 모두 동물 타입이면서 각 객체 타입이라서 가능하다.

//        Rabbit rabbit1 = new Animal
//        Animal은 Animal이지 Tiger 나 Rabbit이 아니기 때문 에 안된다.

        System.out.println("동적 바인딩 확인 =====================================");
        animal1.eat();
        animal2.eat();

        /*
        * 객체별로 고유한 기능을 동작시키기 위해서는 래퍼런스 변수를 형변환하여 Rabbit 과 Tiger로 변경해야
        * 메소드 호출이 가능하다
        * class type cating  : 클래스 형변환
        * ==> 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException이 발생할 수 있다.
        * */
        System.out.println("클래스 타입 형변환===================================");
        ((Rabbit)animal1).jump(); // 다운캐스팅을 통한 형변환
        ((Tiger)animal2).bite();

//        ((Tiger) animal1).bite();

        /*
        * instanceof 연산자 사용
        *  래퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
        *  반환타입이 boolean으로 나온다.
        * */
        System.out.println("instanceof 확인===================================");
        System.out.println("animal1이 Tiger 타입인 지 확인 : " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit 타입인 지 확인 : " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal 타입인 지 확인 : " + (animal1 instanceof Animal));
        System.out.println("animal1이 object 타입인 지 확인 : " + (animal1 instanceof Object));
        // 무언가를 비교할려고 쓸려고 하면 좁은 곳에서 부터 넓은 곳으로 비교를 하면서 확인한다.

        if (animal1 instanceof Rabbit){
            ((Rabbit)animal1).jump();
        }
        if (animal1 instanceof Tiger){
            ((Tiger)animal1).bite();
        }

        /*
        * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
        * up-casting : 상위타입으로 변환
        * down-castng : 하위 타입으로 변환
        * 또한 작성 여부에 따라 명시적과 묵시적 두가지로 구분된다.
        * */

        Animal animal3 = (Animal)new Rabbit(); // up-casting (명시적 형변환)
        Animal animal4 = new Rabbit(); // up-casting (묵시적 형변환)

        Rabbit rabbit1 = (Rabbit)animal1; // down-casting Animal => Rabbit (명시적 형변환)
        // down-casting 은 묵시적 형변환이 불가하다.
    }
}
