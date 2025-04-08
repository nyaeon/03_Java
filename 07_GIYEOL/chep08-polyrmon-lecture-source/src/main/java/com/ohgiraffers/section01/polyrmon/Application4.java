package com.ohgiraffers.section01.polyrmon;

public class Application4 {
    public static void main(String[] args) {
        Application4 app4 = new Application4();

        Animal random = app4.getrandom();
        random.cry();
    }
    public Animal getrandom(){
        int random = (int) (Math.random()*2);

        return random == 0 ? new Rabbit() : new Tiger();

    }
}
