package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    // 매개변수로 전달받은 토끼농장을 구현할 때 사용한 타입변수에 대해서 제한을 할 수 있다.

    // 토끼농장에 있는 토끼가 일반토끼, 바니, 술취한 바니 상관없다.
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    // 토끼농장의 토끼는 바니이거나 그 후손타입(술취한바니)로 만들어진 토끼농장만 매개변수로 사용할 수 있다.
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    // 토끼농장의 토끼는 바니이거나 그 부모타입(Rabbit)으로 만들어진 토끼농장만 매개변수로 사용할 수 있다.
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }
}
