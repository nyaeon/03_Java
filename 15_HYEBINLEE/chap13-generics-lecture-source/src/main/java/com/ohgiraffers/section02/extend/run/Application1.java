package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.Animal;
import com.ohgiraffers.section02.extend.Bunny;
import com.ohgiraffers.section02.extend.DrunkenBunny;
import com.ohgiraffers.section02.extend.Rabbit;
import com.ohgiraffers.section02.extend.RabbitFarm;

public class Application1 {
  public static void main(String[] args) {
    // 토끼의 후손이거나 토끼인 경우에만 타입으로 사용가능
    // RabbitFarm<Animal> farm1 = new RabbitFarm<>();
    // RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
    // RabbitFarm<Sanke> farm3 = new RabbitFarm<>();
     RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
     RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
     RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

     farm4.setAnimal(new Rabbit());
    ((Rabbit) farm4.getAnimal()).cry(); // ✅ 형변환 문법 올바름
    farm4.getAnimal().cry();


     farm5.setAnimal(new Bunny());
    ((Bunny) farm5.getAnimal()).cry(); // ✅ 형변환 문법 올바름
    farm5.getAnimal().cry();


     farm6.setAnimal(new DrunkenBunny());
    ((DrunkenBunny) farm6.getAnimal()).cry(); // ✅ 형변환 문법 올바름
    farm6.getAnimal().cry();
  }
}
