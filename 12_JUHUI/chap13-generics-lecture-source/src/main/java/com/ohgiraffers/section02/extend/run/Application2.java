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
        WildCardFarm wildCardFarm = new WildCardFarm();

        //농장의 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다.
        //wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
        //wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));

        //RabbitFarm<Rabbit> rabbitFarm = new RabbitFarm<>(new Rabbit());을 넣는 것과 같다.
        //RabbitFarm.setAnimal(new Rabbit());과 같다는 것임.
        //new RabbitFarm<Rabbit>(new Rabbit());을 축약한거임

        RabbitFarm<Rabbit> rabbitFarm1 = new RabbitFarm<>();
        rabbitFarm1.setAnimal(new Rabbit());
        wildCardFarm.anyType(rabbitFarm1);

        System.out.println("\n==========\n"); //출력 구분용

        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("\n===========\n");

        //wildCardFarm.extendsType(new RabbitFarm<>(Rabbit)(new Rabbit()));//Bunny를 제한걸어서 Bunny 위는 안되는 것.
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("\n===========\n");

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Bunny()));
        //wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny())); //얘는 안됨.부모타입 X
        //wildCardFarm.superType(new RabbitFarm<>(new DrunkenBunny())); //<>인 제네릭은 지워도 추론이 가능해서 상관없지만, ()는 안됨.

    }
}
