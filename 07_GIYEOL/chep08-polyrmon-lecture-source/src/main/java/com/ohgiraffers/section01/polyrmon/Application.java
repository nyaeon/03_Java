package com.ohgiraffers.section01.polyrmon;

public class Application {
    /***
     * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질수 있다는 것을 의미
     *
     */
    public static void main(String[] args) {
        System.out.println("animal 생성 =======");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("Rabbit 생성 ========");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("tiger 생성 =======");
        Tiger tirger = new Tiger();
        tirger.eat();
        tirger.run();
        tirger.cry();
        tirger.bite();
        /***
         * 토끼와 호랑이는 동물 클래스를 상속받았다
         * 
         * 토끼는 토끼 타입이면서 동물 타입이기도 하다
         * 호랑이는 호랑이 타입이면서 동물타입이기도 하다
         */
        // 부모 타입으로 자식 인스턴스 주소값을 저장
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();
        //anumal은 tiger나 rabbit이 아니다
       // Rabbit rabbit2 = new Animal();


        System.out.println("동적 바인딩 확인=====");
            animal1.cry();
            animal2.cry();

        /***
         * 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변술 형변환하여 Rabbit 과 Tiger로 변경해야
         * 메소드 호출이 가능
         * class type cating: 클래스 형변환
         * ==> 타입 형변한 시 실제 인스턴스 와 타입이 일치하지 않는 경우 예외 에러(Exception) 발생
         */
        System.out.println("클래스 타입 형변환 확인");
            ((Rabbit) animal1).jump();
            ((Tiger) animal2).bite();

          //((Tirger) animal1).bite();
        /***
         * instanceof 연산자 이용
         * 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
         */
        System.out.println("레퍼런스 변수 확인========");
        System.out.println("animal1이 Tiger 인지 확인:"+(animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit 인지 확인:"+(animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal 타입인지 확인 :"+(animal1 instanceof Animal));
        System.out.println("animal1이 object 타입인지 확인 :"+(animal1 instanceof Object));


        if(animal1 instanceof Rabbit){
            ((Rabbit) animal1).jump();
        }
        if(animal1 instanceof Tiger){
            ((Tiger) animal1).bite();
        }

        /***
         * 클래스 형변환은 up-casting 과 down-casting 으로 구분한다
         * up-casting:상위 타입으로 형변환
         * down-casting:하위 타입으로 형변환
         * 또한 작성 여부에 따라 명시적과 묵시적 두가지로 구분
         *
         */
        Animal animal3 =(Animal) new Rabbit(); //up-casting(명시적 형변환)
        Animal animal4 = new Rabbit(); //up-casting(묵시적 형변환)


        Rabbit rabbit1 = (Rabbit) animal1; // anime => rabbit  down-casting(명시적 형변환)
        // Rabbit rabbit2 = animal1; //다운 캐스팅 묵시적 형변환이 안됨





    }
}
