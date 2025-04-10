package com.ohgiraffers.section02.extend;

// 인터페이스 상속 시 implements 키워드 대신 extends 사용하기
//public class RabbitFarm<T implements Animal> {
//public class RabbitFarm<T extends Rabbit> {
    // 토끼 농장
    // Rabbit 타입이면서 Rabbit 타입의 하위타입만 들고 올 수 있음

public class RabbitFarm<T extends Rabbit> {


// 여기서 & : 클래스와 인터페이스 상속 & 사용
// 대신 앞에는 클래스가 와야하고 인터페이스는 바로 뒤에 위치
// ==> &로 여러 타입을 동시에 가지는 경우에만 타입변수에 맞는 타입으로 여김 (둘 중 하나가 아님)
//public class RabbitFarm<T extends Rabbit & Animal> {    // Animal 인터페이스를 상속받고 싶어도 implements가 아닌 extends를 써야 함 (제네릭에서는 implement x)
// 지금은 인터페이스가 달랑 한개니까 의미가 없지만, 인터페이스를 여러 개 상속하게 되면 의미가 생김

    
// 이 경우에는 값을 두 개 넣어줘야 함. 클래스 호출시에도 인자 두개를 넣어야 함. 클래스 여러 개를 상속할 때는 &가 불가능하며, . 사용시 컴파일 에러는 발생하지 않지만 
// 뒤에 작성한 클래스를 또 다른 타입변수로 본다. => 하나의 클래스만 상속받아 구현 가능
//public class RabbitFarm<T extends Rabbit, Reptile> {

    public RabbitFarm() {
    }

    private T animal;

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
