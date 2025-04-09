package com.ohgiraffers.section02.extend;

public class WildCardFarm {

    // 매개변수로 전달받은 토끼농장을 구현할 때 사용한 타입변수에 대해 제한 가능

    // 토끼농장에 있는 토끼: 일반 토끼, 버니, 술 취한 버니 모두 상관없음
    public void anyType (RabbitFarm<?> farm) {
    farm.getAnimal().cry();
    }

    // 토끼가 버니이거나 그 후손 타입 (술 취한 버니)으로 만들어진 토끼농장만 매개변수로 사용 가능
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    // 토끼가 버니이거나 그 부모 타입 (Rabbit)으로 만들어진 토끼농장만 매개변수로 사용 가능
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }

}
