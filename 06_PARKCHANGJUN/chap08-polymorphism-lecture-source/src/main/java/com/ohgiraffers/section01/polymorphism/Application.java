package com.ohgiraffers.section01.polymorphism;

public class Application {

    public static void main(String[] args) {

        /**
         * 다형성
         * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있다는 것을 의미한다.
         */
        System.out.println("Amimal 생성 =========================");
        Animal animal = new Animal(); // 동물 객체 생성
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("Rabbit 생성 =========================");
        Rabbit rabbit = new Rabbit(); // 토끼 객체 생성
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("Tiger 생성 =========================");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        /**
         * Rabbit과 Tiger는 Animal클래스를 상속받았다.
         *
         * Rabbit은 Rabbit타입이기도 하면서 Animal타입이기도 하다. Object타입이기도 하다.
         * Tiger는 Tiger타입이기도 하면서 Animal타입이기도 하다. Object타입이기도 하다.
         */

        /* 부모 타입으로 자식 인스턴스 주소값 저장 */
        // 부모 타입 왼쪽, 자식 타입 오른쪽, 부모는 자식 타입을 받아줄 수 있다.
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        // Animal은 Animal이지 Tiger나 Rabbit이 아니다.
        // 자식은 부모꺼에 대한 내용을 받아줄 수 없다.
        // Animal은 Rabbit 타입이라고 할 수 없기 때문이다.
//        Rabbit rabbit1 = new Animal();
//        Tiger tiger1 = new Animal();

        System.out.println("동적바인딩 확인 =====================");
        animal1.cry(); // cry를 옵션 + 클릭 해보면 animal를 참조하지만 결과 값은 Rabbit이 나온다.
        animal2.cry();

        // 형변환 예시
//        double f = 0.2;
//        num = (int)f

        /**
         * 객체별로 고유한 긴으을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로 변경해야
         * 메소드 호출이 가능하다.
         * class type casting : 클래스 형변환
         * ===> 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우 ClassCastException이 발생할 수 있다.
         */
        System.out.println("클래스타입 형변환 확인 ================");
        ((Rabbit) animal1).jump();
        ((Tiger) animal2).bite();

//        ((Tiger) animal1).bite(); // run타임 시 오류가 발생

        /**
         * instanceof 연산자 이용
         * 레퍼런스변수가 참조하는 실제 인슨턴스가 원하는 타입과 맞는지 비교하는 연산자
         */
        System.out.println("instanceof 확인 ===================");
        System.out.println("anumal1이 Tiger 타입인지 확인 : " + (animal1 instanceof Tiger)); // instanceof 상태 타입 확인, 반환의 타입이 true, false로 나옴
        System.out.println("anumal1이 Rabbit 타입인지 확인 : " + (animal1 instanceof Rabbit)); // Rabbit 객체 주소 = "글자넣은부분"
        System.out.println("anumal1이 Animal 타입인지 확인 : " + (animal1 instanceof Animal));
        System.out.println("anumal1이 Object 타입인지 확인 : " + (animal1 instanceof Object));

        if(animal1 instanceof Rabbit) {
            ((Rabbit) animal1).jump();
        }

        if(animal1 instanceof Tiger) {
            ((Tiger) animal1).bite();
        }
        // 맞는것만 출력해서 나옴. Rabbit만 맞기 때문에 토끼만 출력됨. Tiger 타입은 animal1 타입이 아니기 때문

        /**
         * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
         * up-casting : 상위 타입으로 형변환
         * down-casting : 하위 타입으로 형변환
         * 또한 작성 여부에 따라 명시적과 묵시적 두가지로 구분된다.
         */

        Animal animal3 = (Animal) new Rabbit(); // 위 아래 같은 말. up-casting(명시적 형변환) - 드러나있는것
        Animal animal4 = new Rabbit(); // 자식이 상위 클래스로 감. up-casting(묵시적 형변환). 자식 타입이 부모 타입으로 변경. 부모타입만 보고 있다.

        Rabbit rabbit1 = (Rabbit) animal1; // 부모 타입에서 자식 타입으로 바뀜. 형변환에 의해. Animal => Rabbit down-casting(명시적 형변환)
//        Rabbit rabbit2 = animal1; // down-casting은 묵시적 형변환이 안됨. 다운캐스팅은 바꿔야할 내용이 있어야 함.


    }
}
