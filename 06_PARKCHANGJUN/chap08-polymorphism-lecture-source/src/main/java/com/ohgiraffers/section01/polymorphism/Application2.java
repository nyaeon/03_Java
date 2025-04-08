package com.ohgiraffers.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {

        Animal[] /*객체 배열한것*/ animals = new Animal[5]; // 5개의 배열을 만듬. null, null, null, null, null
        // 하나의 타입으로 여러 타입을 받아 줄 수 있다라는 의미(밑)
        animals[0] = new Rabbit(); // 다형성이 적용되어서 업캐스팅이 됨.
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        // Aninal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 시 동적바인딩을 이용하여 출력
        for(int i = 0; i < animals.length; i++){
            animals[i].cry();
        }

        for(int i = 0; i < animals.length; i++) {

            if(animals[i] instanceof Rabbit){

                ((Rabbit) animals[i]).jump();
            } else if(animals[i] instanceof Tiger){

                ((Tiger) animals[i]).bite();
            } else {

                System.out.println("호랑이나 토끼가 아닙니다.");
            }
        }
    }
}
