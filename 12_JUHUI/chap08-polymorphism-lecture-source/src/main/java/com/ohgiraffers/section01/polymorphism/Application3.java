package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        Application3 app3 = new Application3(); // 여기서 사용하겠다는 객체를 생성한 거임.

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        app3.feed(animal1); // animal에서 animal을 넣어준거라 가능.
        app3.feed(animal2);

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();

        app3.feed(animal3); // 토끼가 동물로 들어감.업캐스팅(묵시적으로 들어감.형변환)
        app3.feed(animal4);
        app3.feed((Animal) animal3); // 토끼를 동물로 바꿈. 명시적 형변환. 자식이 부모타입으로 바뀜(다운 캐스팅)

        app3.feed(new Rabbit()); // 자식이 부모타입으로 들어감. 업캐스팅

    }

    public void feed(Rabbit rabbit) {}

    public void feed(Tiger tiger) {}

    public void feed(Animal animal) {
        animal.eat();
    }
}
