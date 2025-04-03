package com.ohgiraffers.section01.polymophism;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 다형성
         *  다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있다는 것을 의미
         **/

        System.out.println("================================= Animal 생성 =================================");

        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("================================= Rabbit 생성 =================================");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("================================= Tiger 생성 =================================");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        /*
         * Rabbit과 Tiger는 Animal클래스를 상속 받았다.
         *
         * Rabbit은 Rabbit타입이기도 하면서, Animal타입이기도 하다.
         * Tiger은 Tiger타입이기도 하면서, Animal타입이기도 하다.
         **/

        // 부모 타입으로 자식 인스턴스 주소값 저장
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        // Animal에 Rabbit 타입이 없음 (부모가 자식을 상속받지 못함)
        // Animal은 Animal이지, Rabbit나 Tiger가 아니다.
        //        Rabbit rabbit1 = new Animal();
        //        Tiger tiger1 = new Animal();

        System.out.println("=================== 동적바인딩 확인 ===================");
        // 컴파일 할때는 Animal을 바라보고, 런 실행 시 Rabbit를 바라본다.
        // 자식 클래스에서 오버라이딩한 메소드가 없으면, 부모 클래스의 메소드를 호출
        // 자식 클래스에서 오버라이딩한 메소드를 먼저 호출
        // 오버라이딩 된 메소드만 호출 할 수 있고, 자식 클래스의 메소드는 호출 하지 못함
        animal1.cry();
        animal2.cry();

        /*
         * 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로 변경해야
         * 메소드 호출이 가능하다.
         * class type casing : 클래스 형변환
         * ===> 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException이 발생할 수 있다.
         **/
        System.out.println("=================== 클래스 타입 형변환 확인 ===================");
        ((Rabbit) animal1).jump();
        ((Tiger) animal2).bite();

        //        ((Tiger) animal1).bite(); // 런타임 시 오류 발생

        /*
        * instanceOf 연산자 활용
        * 레퍼런스변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
        * */
        System.out.println("=================== instanceOf 확인 ===================");
        System.out.println("animal1이 Tiger 타입인지 확인 : " + (animal1 instanceof Tiger)); // false
        System.out.println("animal1이 Rabbit 타입인지 확인 : " + (animal1 instanceof Rabbit)); // true
        System.out.println("animal1이 Animal 타입인지 확인 : " + (animal1 instanceof Animal)); // true
        System.out.println("animal1이 Object 타입인지 확인 : " + (animal1 instanceof Object)); // true

        // 체크 범위는 좁은 범위 => 넓은 범위
        if (animal1 instanceof Rabbit) {
            ((Rabbit) animal1).jump();
        } else if (animal1 instanceof Tiger) {
            ((Tiger) animal1).bite();
        }

        /*
        * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
        * up-casting : 상위 타입으로 형변환
        * down-casting : 하위 타입으로 형변환
        * 또한 작성 여부에 따라 명시적과 묵시적 두가지로 구분된다.
        * */

        // up-casting (자식 타입에서 부모 타입으로 변경), 명시적 형변환
        Animal animal3 = (Animal) new Rabbit();
        // up-casting 묵시적 형변환
        Animal animal4 = new Rabbit();

        // down-casting (부모타입에서 자식타입으로 변경), 명시적 형변환
        // down-casting는 묵시적 형변환 안됨
        Rabbit rabbit1 = (Rabbit) animal1;


    }
}
