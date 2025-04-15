package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {
        /*
         * 와일드카드(WildCard)
         * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
         * 그 객체의 타입변수를 제한 할 수 있다.
         *
         * <?> : 제한없음
         * <? extends Type> : 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용가능)
         * <? super Type> : 와일드카드 하한 제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능)
         * */
        WhildCardFarm whildCardFarm = new WhildCardFarm();

        // 농장 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다.
//        whildCardFarm.anyType(new RabbitFarm<new Mammal()>);
//        whildCardFarm.anyType(new RabbitFarm<new Reptile()>);
//        new RabbitFarm<Rabbit>(new Rabbit());

        RabbitFarm rabbitFarm1 = new RabbitFarm();
        rabbitFarm1.setAnimal(new Rabbit());
        whildCardFarm.anyType(rabbitFarm1);
        whildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        whildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

//        whildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        whildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        whildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        whildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        whildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        whildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
