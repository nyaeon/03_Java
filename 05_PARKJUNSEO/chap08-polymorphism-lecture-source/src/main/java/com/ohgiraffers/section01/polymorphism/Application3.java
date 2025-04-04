package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        Application3 app3 = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        app3.feed(animal1);  // 동일한 타입이기 때문에 가능하다.
        app3.feed(animal2);  // 동일한 타입이기 때문에 가능하다.

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();

        app3.feed(animal3);  // => 업캐스팅이라고 볼 수 없음 / 묵시적 업캐스팅 (자식이 부모로) ?
        app3.feed(animal4);  // => 업캐스팅이라고 볼 수 없음 / 묵시적 업캐스팅 (자식이 부모로) ?
        /*
        * 위의 두 경우는 어떤 메소드가 호출되느냐에 따라 업캐스팅으로 볼 수도 있고, 아닐 수도 있음
        * 만약 animal의 feed가 호출되면 업캐스팅, 아니면 단순 메소드 호출
        * 이를 확실하게 싶은 경우 ?
        * 1) 확실한 업캐스팅 -> 명시적 업캐스팅이 나음
        * 2) app3.feed(new Rabbit()); 이런 방식으로 쓰면 -> rabbit의 feed 적용
        * 3) app3.feed((Rabbit(animal)); 이런 방식으로 쓰면 -> 다운 캐스팅이 일어나 rabbit의 feed 적용
        * */

        app3.feed((Animal)animal3);  // 명시적 업캐스팅 (자식이 부모로)

        app3.feed(new Rabbit());   // 이런 애들은 확실히 rabbit의 feed를 씀 (만약 rabbit의 feed가 없다면 자연스럽게 업캐스팅)

    }

    public void feed (Rabbit rabbit) {
    }

    public void feed (Tiger tiger) {
    }

    public void feed (Animal animal) {
        animal.eat();
    }

}



