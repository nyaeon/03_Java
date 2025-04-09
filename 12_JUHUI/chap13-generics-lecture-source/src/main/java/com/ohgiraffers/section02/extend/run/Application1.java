package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {

        // 토끼의 후손이거나 토끼인 경우에만 타입으로 사용가능 //제약을 걸어놨기 때문에 안되는것.
        //RabbitFarm<Animal> farm1 = new RabbitFarm<>(); //안됨. 토끼후손이 아님
        //RabbitFarm<Mammal> farm2 = new RabbitFarm<>(); //얘도 안됨. 상위버전이라
        //RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>(); //당연히 얘도 안됨. 말도안됨.

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>(); // 얘는 됨.
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>(); // 얘도 됨.
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>(); // 얘도 됨.

        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry();
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        ((Bunny)farm5.getAnimal()).cry();
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        ((DrunkenBunny)farm6.getAnimal()).cry();
        farm6.getAnimal().cry();

    }
}
