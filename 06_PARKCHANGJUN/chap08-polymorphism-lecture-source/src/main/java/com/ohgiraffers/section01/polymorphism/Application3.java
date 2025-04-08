package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        Application3 app3 = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        app3.feed(animal1); // 동일한 타입이기 때문에 가능하다. // feed() 했을때 animal을 눌러야됨
        app3.feed(animal2);

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();

        app3.feed(animal3); // 묵시적 형변환. 자식 타입이 부모타입의 들어감.
        app3.feed(animal4);

        app3.feed((Animal) animal3); // Rabbit이 Animal로 바뀜, 명시적 형변환
        app3.feed((Animal) animal4);

        // 변수에 담아서 넣나 직접 넣나 똑같음
        app3.feed(new Rabbit()); // 자식이 부모타입으로 들어감. up-casting

    }

    public void feed(Rabbit rabbit) { // 오버로딩 발생

    }

    public void feed(Tiger tiger) { // 오버로딩 발생

    }

    public void feed(Animal animal) {
        animal.eat();
    }
}

// 현재 어디까지 참조하는지
// 업캐스팅인지, 다운캐스팅인지 꼭 한번 해보기
// 추상메소드 (미완성된메소드라보면됨)
