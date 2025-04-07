package com.ohgiraffers.section01.polymorphism;

public class Application {

    public static void main(String[] args) {

        /*
         * 다형성
         * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있다는 것을 의미한다.
         */
        System.out.println("Animal 생성 ===========================================");
        Animal animal = new Animal(); // 객체 생성해
        animal.eat(); // 호출
        animal.run();
        animal.cry();

        System.out.println("Rabbit 생성 ===========================================");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("tiger 생성 ===========================================");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        /*
         * Rabbit과 Tiger는 Animal 클래스를 상속받았다.
         *
         * Rabbit은 Rabbit 타입이기도 하면서 Animal 타입이기도 하다.
         * Tiger는 Tiger 타입이기도 하면서 Animal 타입이기도 하다.
         */

        /* 부모 타입으로 자식 인스턴스 주소값 저장 */
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();
        // Animal은 Animal이지 tiger rabbit이 아님.
//        Rabbit rabbit1 = new Animal();
//        Tiger tiger1 = new Animal();

        System.out.println("동적바인딩 확인 ===========");
        animal1.cry(); // 지금 주소인 토끼에서 재정의가 되어 토끼가 나옴. 중간에 대상이 바뀌는 거임.
        animal2.cry();

        /*
         *객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로 변경해야
         * 메소드 호출이 가능하다
         * class type casting: 클래스 형변환
         * ==> 타입 형변환시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException이 발생할 수 있다.
         */
        System.out.println("클래스타입 형변환 확인 =========");
        ((Rabbit) animal1).jump(); //animal이 rabbit이 되었음. 형변환을 통해서
        ((Tiger) animal2).bite();

        //((Tiger) animal1).bite(); // run타임시 오류.타입 잘 확인해야 함 토끼인지 호랑이인지

        /*
         * instanceof 연산자 이용
         * 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
         */
        System.out.println("instanceof 확인 =======================");
        System.out.println("animal1이 Tiger 타입인지 확인 : " + (animal1 instanceof Tiger));
        // rabbit 객체 타입이 들어가있어 아님 그래서 false가 나옴

        System.out.println("animal1이 Rabbit 타입인지 확인 : " + (animal1 instanceof Rabbit));
        // 맞아서 true. animal1에는 rabbit이 들어가 있음.

        System.out.println("animal1이 Animal 타입인지 확인 : " + (animal1 instanceof Animal));
        // rabbit은 rabbit타입이기도 하고 animal타입이기도해서 true.

        System.out.println("animal1이 Object 타입인지 확인 : " + (animal1 instanceof Object));
        // true.

        if (animal1 instanceof Rabbit) {
            ((Rabbit) animal1).jump();
        }

        if (animal1 instanceof Tiger) {
            ((Tiger) animal1).bite();
        }

        /*
         * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
         * up-casting : 상위 타입으로 형변환. 자식 -> 상위
         * down-casting : 하위 타입으로 형변환. 상위 -> 자식
         * 또한 작성 여부에 따라 명시적과 묵시적 두가지로 구분된다.
         */
        Animal animal3 = (Animal) new Rabbit(); // 자식 타입인 토끼가 부모인 애니멀로 갔으니 업 캐스팅. (명시적 형변환)
        Animal animal4 =  new Rabbit(); // 업캐스팅(묵시적 형변환)

        Rabbit rabbit1 = (Rabbit)animal1; //animal 타입이 rabbit으로 바뀜. 다운 캐스팅(명시적 형변환)

    }
}
