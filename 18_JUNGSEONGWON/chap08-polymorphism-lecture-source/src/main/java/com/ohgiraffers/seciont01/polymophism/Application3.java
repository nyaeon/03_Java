package com.ohgiraffers.seciont01.polymophism;

public class Application3 {
    public static void main(String[] args) {

        Application3 app3 = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        app3.feed(animal1);
        app3.feed(animal2);

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();

        app3.feed(animal3); // 묵시적 형변환
        app3.feed(animal4);
        app3.feed((Animal)animal3); // 명시적 형변환
        app3.feed((Animal)animal4);

        app3.feed(new Rabbit()); // up-casting

    }
    public void feed (Rabbit rabbit){}
    // 오버로딩 발생
    public void feed (Tiger tiger){}

    public void feed (Animal animal){
        animal.eat();
    }

}
