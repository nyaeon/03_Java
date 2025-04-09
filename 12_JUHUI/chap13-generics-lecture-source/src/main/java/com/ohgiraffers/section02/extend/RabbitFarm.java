package com.ohgiraffers.section02.extend;

//Animal로 바꿔도 정상동작함. Animal은 인터페이스라 implements를 안써도 정상동작함.
//제네릭<>에서는 implements 사용 불가 extends만 사용해야함

//인터페이스 상속 시 implements 키워드 대신 extends 키워드를 사용한다.
//public class RabbitFarm<T extends Animal> {
//public class RabbitFarm<T extends Rabbit> {

// 여기서의 &(AND)의 의미는

// 클래스와 인터페이스 상속 시 &를 사용한다.
// 대신 앞에는 클래스가 와야하고, 인터페이스는 뒤에 온다.
// ==> &로 여러 타입을 동시에 가지는 경우에만 타입변수에 맞는 타입으로 여긴다. (둘 중 하나가 아님)
//public class RabbitFarm<T extends Rabbit & Animal> {


// ,(콤마)는 또 다른 타입이 필요할 때 사용

// 클래스 여러개는 & 사용이 불가하며, ,(콤마)사용 시 컴파일 에러는 발생하지 않지만
// 뒤에 작성한 클래스를 또 다른 타입 변수로 본다. -> 하나의 클래스만 상속받아 구현할 수 있다.
//public class RabbitFarm<T extends Rabbit, Reptile> {

public class RabbitFarm<T extends Rabbit> {

    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    //getter
    public T getAnimal() {
        return animal;
    }
    //setter
    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
