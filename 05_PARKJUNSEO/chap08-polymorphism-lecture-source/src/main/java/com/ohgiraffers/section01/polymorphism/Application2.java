package com.ohgiraffers.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();  // 업캐스팅
        animals[1] = new Tiger();   // 이제 이렇게 여러 타입을 넣을 수 있음
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        for (int i = 0; i < animals.length; i++) {
            // 동적바인딩 - 오버라이딩한 메소드 호출 시 동적바인딩을 이용하여 출력함
            animals[i].eat();
            animals[i].cry();
        }

        for (int i = 0; i < animals.length; i++) {
            // 오버라이딩 하지 않은 메소드를 사용 시 (자식 클래스 단독의 메소드 사용) 강제형변환 (다운캐스팅) 필요
            ((Rabbit) animals[i]).jump();
            ((Tiger) animals[i]).bite();
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).bite();
            } else if (animals[i] instanceof Rabbit) {
                ((Rabbit) animals[i]).jump();
            } else {
                System.out.println("호랑이나 토끼가 아닙니다.");
            }
        }
    }
}
