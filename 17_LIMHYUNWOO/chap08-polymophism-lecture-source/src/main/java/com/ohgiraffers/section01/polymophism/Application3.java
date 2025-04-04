package com.ohgiraffers.section01.polymophism;

public class Application3 {
    public static void main(String[] args) {

        Application3 app3 = new Application3();
        Animal animal1 =new Rabbit();
        Animal animal2 =new Tiger();

        app3.feed(animal1); // 동일한 타입이기 때문에 가능하다
        app3.feed(animal2);
        Rabbit animal3 =new Rabbit();
        Tiger animal4 =new Tiger();

        app3.feed(animal3); // 업캐스팅(묵시적)
        app3.feed(animal4);

        app3.feed((Animal) animal3); //업캐스팅(명시적)
        app3.feed((Animal) animal4); //업캐스팅(명시적)

        app3.feed(new Rabbit());

    }

    public void feed(Rabbit rabbit) {}

    public void feed(Tiger tiger) {}

    public void feed(Animal animal) {
        animal.eat();
    }
}
