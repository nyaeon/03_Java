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
        WildcardFarm cardfarm = new WildcardFarm();
        //농장 생성 자체가 불가능한 것은 매개변수로 사용 불가함
     //  cardfarm.anytype(new RabbitFarm<Mammal>(new Mammal()));
     //  cardfarm.anytype(new RabbitFarm<Reptile>(new Reptile()));
        RabbitFarm<Rabbit> rabbitfarm1 = new RabbitFarm<>();
        rabbitfarm1.setAnimal(new Rabbit());
        cardfarm.anytype(new RabbitFarm<Rabbit>(new Rabbit()));
        cardfarm.anytype(new RabbitFarm<Bunny>(new Bunny()));
        cardfarm.anytype(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

       // cardfarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        cardfarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        cardfarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        cardfarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        cardfarm.superType(new RabbitFarm<Bunny>(new Bunny()));
    //    cardfarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


    }
}
