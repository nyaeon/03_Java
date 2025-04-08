package com.ohgiraffers.section01.polymorphism;

public class Application4 {

    public static void main(String[] args) {

        Application4 app4 = new Application4();

        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();

    }

    // 반환 타입의 부모타입을 줌
    public Animal getRandomAnimal() {

        int random = (int) (Math.random() * 2); // 0과 1

        return random == 0 ? new Rabbit() : new Tiger(); // 삼항연산자 : random이 0이면 Rabbit 아니면 Tiger
    }
}
