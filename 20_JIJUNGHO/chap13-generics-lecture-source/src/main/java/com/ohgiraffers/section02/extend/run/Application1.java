package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {

        // 졔약 조건 : 토끼의 후손이거나 토끼인 경우에만 타입으로 사용 가능
        // RabbitFarm<Animal> farm1 = new RabbitFarm<>(); // Animal 제약 조건 위반
        // RabbitFarm<Mammal> farm2 = new RabbitFarm<>(); // Mammal 제약 조건 위반
        // RabbitFarm<Raptile> farm3 = new RabbitFarm<>(); // Raptile 제약 조건 위반
        // RabbitFarm<Snake> farm4 = new RabbitFarm<>(); // Snake 제약 조건 위반

        RabbitFarm<Rabbit> farm5 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm6 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm7 = new RabbitFarm<>();

        farm5.setAnimal(new Rabbit());
        farm5.getAnimal().cry();

        farm6.setAnimal(new Bunny());
        farm6.getAnimal().cry();

        farm7.setAnimal(new DrunkenBunny());
        farm7.getAnimal().cry();

    }

}
