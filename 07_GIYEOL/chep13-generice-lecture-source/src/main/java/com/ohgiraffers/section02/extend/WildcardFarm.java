package com.ohgiraffers.section02.extend;

public class WildcardFarm {
    //매개변수로 전달 받은 토끼 농장을 구현할 때 사용한 타입변수에 대해서 제한을 할 수 있다

    //토끼 농장에 있는 토끼가 일반 토끼, 바니 ,음주 토끼 상관 없음
    public void anytype(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    // 토끼 농장의 토끼는 바니이거나 그 후손타입(음주 바니)로 만들어진 토끼농장만 매개변수로 사용 가능
    public void extendsType(RabbitFarm<? extends  Bunny> farm) {
        farm.getAnimal().cry();
    }

    //토끼 농장의 토끼는 바니이거나 부모타입(Rabbit)으로 만들어진 토끼 농장만 매개변수로 사용 가능
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAnimal().cry();
    }

}
