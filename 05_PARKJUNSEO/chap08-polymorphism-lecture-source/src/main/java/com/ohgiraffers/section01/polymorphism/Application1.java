package com.ohgiraffers.section01.polymorphism;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 다형성
         * : 다형성이란 하나의 인스턴스가 여러가지 타입을 가질 수 있다는 것을 의미함
         * */
        System.out.println("Animal 생성 ===============================");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("Rabbit 생성 ===============================");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("Tiger 생성 ===============================");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();

        /*
         * Rabbit과 Tiger는 Animal 클래스를 상속받음.
         *
         * Rabbit은 Rabbit 타입이기도 하면서 Animal 타입이기도 하면서 Objict 타입이기도 하다. (상속성)
         * Tiger은 Tiger 타입이기도 하면서 Animal 타입이기도 하면서 Object 타입이기도 하다. (상속성)
         * */

        /* 부모 타입으로 자식 인스턴스 주소값 저장 (부모는 자식을 받아줄 수 있다.)*/
        Animal animal1 = new Rabbit();   // 기본적으로는, 부모 타입을 먼저 바라보고, 이후 오버라이딩이 되어있으면 자식 타입의 메소드나 필드에 접근하는 것임
        Animal animal2 = new Tiger();

        /* Animal은 Animal이지, Rabbit이나 Tiger가 아니다. */
//        Rabbit rabbit1 = new Animal();
//        Tiger tiger1 = new Animal();

        System.out.println("동적 바인딩 확인 ===============================");
        animal1.cry();      // animal의 메소드가 적용될 거 같지만 토끼의 메소드 작용. 일단 부모 타입을 바라보다가 자식타입이 오버라이딩 한 걸 알게 됐기 때문임
        animal2.cry();
        /* 만약 토끼가 오버라이딩한 메소드를 주석처리 하면 다시 animal의 메소드 적용 */

        /*
         * 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로 변경해야
         * 메소드 호출이 가능하다.
         * Class type casting : 클래스 형변환
         * ==> 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException이 발생할 수 있다.
         * */
        System.out.println("클래스타입 형변환 확인 ==========================");
        ((Rabbit) animal1).jump();
        ((Tiger) animal2).bite();
        /* 강제 형변환이 필요한 이유
         * : 강제 형변환이 없다면, 일단은 부모 타입을 봄. 근데 jump가 없잖아? 당황하게됨.
         * jump는 토끼만의 메소드이지, 오버라이딩 한 것이 아니기 때문. 강제형변환이 없기 때문에 자식타입으로 넘어가지도 못하는 것임
         * 따라서 강제 형변환이 필요함
         * */

        System.out.println("instanceOf 확인 ==============================");
        /*
         * instanceOf 연산자 사용
         * 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
         * */
        System.out.println("animal1이 Tiger 타입인지 확인 : " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit 타입인지 확인 : " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 animal 타입인지 확인 : " + (animal1 instanceof Animal));
        System.out.println("animal1이 Object 타입인지 확인 : " + (animal1 instanceof Object));

        if (animal1 instanceof Animal) {
            ((Rabbit) animal1).jump();
        }

        if (animal1 instanceof Tiger) {
            ((Tiger) animal1).bite();
        }

        /*
         * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
         * up-casting : 상위 타입으로 형변환
         * down-casting : 하위 타입으로 형변환
         * 또한 작성 여부에 따라 명시적 작성과 묵시적 작성 두 가지로 구분된다.
         * */
        Animal animal3 = (Animal) new Rabbit();  // 업캐스팅(명시적 형변환)
        Animal animal4 = new Tiger();            // 업캐스팅(묵시적 형변환)

        Rabbit rabbit1 = (Rabbit) animal1;       // 다운캐스팅 (명시적 형변환) Animal -> Rabbit
        /* 다운 캐스팅은 변수 간의 강제 형변환과 비슷함  // 다운캐스팅은 묵시적 형변환 불가능 (명시적으로 해야하는 것 또한 강제 형변환과 비슷함) */


    }
}