package com.ohgiraffers.section02.extend;

// 인터페이스 상속시 implements 대신 extends를 사용한다.
// public class RabbitFram<T implements Animal> ❌
// public class RabbitFram<T extends Animal>

// 클래스와 인터페이스 상속 시 &를 사용한다.
// 대신 순서는 '클래스&인터페이스'
// &로 여러 탕비을 동시에 가지는 경우에만 타입변수에 맞는 타입으로 여긴다.

// 클래스 여러개는 &사용이 불가하며, 콤마를 사용시 컴파일 에러는 발생하지 않지만
// 뒤에 작성한 클래스를 또 다른 타입변수로 보다. -> 하나의 클래스만 상속받아 구현할 수 있다.
// public class RabiitFram<T extends Rabbit, Reptile>
public class RabbitFarm<T extends Rabbit> {
  private T animal;

  public RabbitFarm() {}

  public RabbitFarm(T animal) {
    this.animal = animal;
  }

  public T getAnimal() {
    return animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }
}
