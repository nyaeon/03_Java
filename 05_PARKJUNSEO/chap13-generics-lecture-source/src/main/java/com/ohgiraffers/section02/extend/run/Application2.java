package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {


        /*
         * 와일드카드(WildCard)
         * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
         * 그 객체의 타입변수를 제한 할 수 있다.
         *
         *                       <?> : 제한없음
         * <? extends Type> : 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용가능)
         * <? super Type> : 와일드카드 하한 제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능)
         * */

        WildCardFarm wildCardFarm = new WildCardFarm();

        // 농장 새성 자체가 불가능한 것은 매개변수로 사용 불가
//        WildCardFarm.anyType(new RabbitFarm<Reptile> new(Reptile()))
//        WildCardFarm.anyType(new RabbitFarm<Mammal> new(Mammal()))
        RabbitFarm<Rabbit> rabbitFarm1 = new RabbitFarm<>();
        rabbitFarm1.setAnimal(new Rabbit());
        wildCardFarm.anyType(rabbitFarm1);

        // 위의 코드를 풀어쓴 형태
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Bunny()));    // RabbitFarm의 매개변수로 Bunny와 그 자식 클래스만 가능하게 만듦
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));    // super Bunny를 걸어뒀기 때문에 Bunny와 그 상위 클래스만 가능하게 만듦
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        // wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));    // 얘 안됨







    }
}
