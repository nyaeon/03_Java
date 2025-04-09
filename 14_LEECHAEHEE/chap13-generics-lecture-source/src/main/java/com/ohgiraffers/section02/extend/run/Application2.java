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
        WildcardFarm wildcardFarm = new WildcardFarm();


        // 농장 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다.
//        wildcardFarm.anyType(new RabbitFarm<Mammal> {});
//        wildcardFarm.anyType(new RabbitFarm<Raptile> {});
        RabbitFarm<Rabbit> rabbitFarm1 = new RabbitFarm<>(new Rabbit());
        rabbitFarm1.setAnimal(new Rabbit());
        wildcardFarm.anyType(rabbitFarm1);  // 축약 :new RabbitFarm<Rabbit>(new Rabbit())
        wildcardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildcardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

//        wildcardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
//        Bunny와 하위 클래스만 사용 가능
        wildcardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildcardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // Bunny와 상위 클래스만 사용 가능
        wildcardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildcardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildcardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

    }
}
