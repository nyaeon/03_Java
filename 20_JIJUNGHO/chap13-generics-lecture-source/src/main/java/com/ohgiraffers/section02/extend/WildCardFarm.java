package com.ohgiraffers.section02.extend;

public class WildCardFarm {
    // 매개변수로 전달받은 토끼농장을 구현할 때 사용한 타입변수에 대해서 제한을 할 수 있다.

    // RabbitFarm 클래스에서 extends를 Rabbit를 받아줬기 때문에 아래 3개의 조건이 가능하다.
    // 1. 토끼농장의 토끼는 (일반토끼, 바니토끼, 술취한바니토끼) 상관없이 가능
    public void anytype(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    // 2. 토끼농장의 토끼는 바니이거나, 그 후손타입(술취한 바니)으로 만들어진 토끼농장만 매개변수로 사용 가능
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    // 3. 토끼농장의 토끼는 바니이거나, 그 부모타입(일반토끼)으로 만들어진 토끼농장만 매개변수로 사용 가능
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }

}
