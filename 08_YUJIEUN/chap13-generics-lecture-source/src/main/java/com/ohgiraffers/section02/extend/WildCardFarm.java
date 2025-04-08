package com.ohgiraffers.section02.extend;

public class WildCardFarm {
    // 매개변수로 전달받은 토끼농장을 구현할 때 사용한 타입변수에 대해서 제한을 할 수 있다.

    //토끼농장에 있는 토끼가 일반토끼, 바니, 술취한 바니 상관없다.
    public void anyType(RabbitFarm<?> farm){
        if (farm.getAnimal() != null) {
            System.out.println("anyType: " + farm.getAnimal());
            // farm.getAnimal().cry(); //
        }
    }

    // Rabbit 또는 그 하위 타입만 허용 - cry() 호출 가능
    public void extendsType(RabbitFarm<? extends Rabbit> farm){
        if (farm.getAnimal() != null) {
            farm.getAnimal().cry(); // ✅
        }
    }

    // Bunny 또는 상위 타입만 허용 - 다운캐스팅 필요
    public void makeSound(RabbitFarm<? super Bunny> farm){
        Object obj = farm.getAnimal();
        if (obj instanceof Bunny) {
            ((Bunny) obj).cry(); // ✅
        }
    }
}