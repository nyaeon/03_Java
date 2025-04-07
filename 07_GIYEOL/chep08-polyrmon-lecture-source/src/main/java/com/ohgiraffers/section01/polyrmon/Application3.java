package com.ohgiraffers.section01.polyrmon;

public class Application3 {
    public static void main(String[] args) {
        Application3 app3 = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();
        app3.feed(animal1); //동일 타입이기에 가능
        app3.feed(animal2);

        Rabbit animal3 = new Rabbit(); // 묵시적 형변환
        Tiger animal4 = new Tiger();

        app3.feed((Animal)animal3); //명시적 형변환
        app3.feed((Animal)animal4);

        app3.feed(new Rabbit());//업캐스팅

    }
    public void feed(Rabbit rabbit) {

    }
    public void feed(Tiger tirger) {

    }

    public void feed(Animal animal) {
        animal.eat();
    }
}
