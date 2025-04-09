package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {

        // 토끼의 후손이거나 토끼인 경우에만 타입으로 사용 가능
        // RabbitFarm<Animal> farm1 = new RabbitFarm<>()  // 얘는 불가 // RabbitFarm에서 Rabbit 클래스를 상속받았기 때문에 Rabbit 타입의 하위타입만 들어올 수 있음
        // RabbutFarm<Mammal> farm2 = new RabbitFarm<>()  // 얘도 불가
        // RabbitFarm<Snake> farm3 = new RabbitFarm<>();  // 얘도 불가
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());    // Farm4는 Rabbit 타입
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();
    }
}
