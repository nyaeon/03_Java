package com.ohgiraffers.section01.polymophism;

public class Application4 {
    public static void main(String[] args) {
        Application4 app4 = new Application4();

        Animal randomAnimal = app4.gerRandomAnimal();
        randomAnimal.cry();
    }

    public Animal gerRandomAnimal() {
        int random = (int) (Math.random() * 2);

        return random == 0 ? new Rabbit() : new Tiger();
    }
}
