package com.ohgiraffers.section02.functionalinterface;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class Application1 {

    public static void main(String[] args) {

        /* JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
         *  Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다.
         *  Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.
         *  Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)
         *  Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있다. 차이점은 매개변수로 연산을 한 후 통일타입으로 리턴한다.
         *  Predicate : 매개변수와 boolean 값을 반환하는 testXXX()를 가지고 있다. (매개변수를 활용하여 boolean 반환)
         */

        // 매개변수 없고, 리턴값도 없는 람다
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        r.run(); // 밑에와 같은 말인데 밑은 람다식으로 바꾼 것

        // Runnable에 대해 알아보기
        Runnable runnable = () -> System.out.println("hello");
        runnable.run(); // 내가 넣어준 Runnable을 다시 실행하겠다.

        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "이(가) 입력됨");
            }
        };

        c.accept("hello world!!!");
        /* consumer<T>#accept(T t) : 객체 T를 받아 소비 */
        // accept타입이라는 메소드는 반환 타입을 가지고 있지 않다.
        Consumer<String> consumer = (String str) -> System.out.println(str + "이(가) 입력됨");
        consumer.accept("helloworld");

        /* Biconsumer<T, U>#accpet(T t, U u) : void : 객체를 T, U를 받아 소비한다. */
        BiConsumer<String, LocalTime> biConsumer =(str1, time) -> System.out.println(str1 + "(이)가 " + time + "에 입력됨");
        biConsumer.accept("홍길동", LocalTime.now()); // 두 개의 객체를 받아서 소비하고 끝

        /* IntConsumer#accept(int value) : void : > int값을 받아 소비한다. */
        IntConsumer intConsumer = num -> System.out.println("입력하신 숫자는 " + num + "입니다.");
        intConsumer.accept(1);

        /* ObjIntConsumer<T>#accept<T t, int value) : void : > 객체 T와 int값을 받아 소비한다. */
        ObjIntConsumer<Random> objIntConsumer =
                (random, bound) -> System.out.println("0부터" + bound + "전 까지의 난수 발생 : " + random.nextInt(bound));
        objIntConsumer.accept(new Random(), 10);
    }
}
