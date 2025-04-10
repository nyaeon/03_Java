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
        System.out.println("========== anytype ==========");
        // 농장에 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다.
        //        wildCardFarm.anytype(new RabbitFarm<Mammal>(Mammal));
        //        wildCardFarm.anytype(new RabbitFarm<Reptile>(Reptile));

        // RabbitFarm<Rabbit> rabbitFarm = new RabbitFarm<>();
        // wildCardFarm.anytype(rabbitFarm);
        // ⬇️ 축약 <Rabbit> -> <>안에 있는 타입은 코드가 자동으로 추론하기때문에 적지 않아도 된다.
        wildCardFarm.anytype(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anytype(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anytype(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // 바니 타입 후손만 매개변수로 전달 가능
        System.out.println("\n========== extendsType ==========");
        // wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit())); // 실행 안됨
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        // 바니 타입 부모만 매개변수로 전달 가능
        System.out.println("\n========== superType ==========");
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        // wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny())); // 실행 안됨

    }
}
