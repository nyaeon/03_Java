package com.ohgiraffers.section02.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Application2 {

    public static void main(String[] args) {
        // Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.

        // 인터페이스 활용
        Supplier<LocalDateTime> s = new Supplier<LocalDateTime>() {
            @Override
            public LocalDateTime get() {
                return LocalDateTime.now();
            }
        };

        // 람다식 활용
        // 해당 타입에 맞는 리턴 타입이 반드시 필요하다.
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        // 한줄식이면 return 값이랑 {}를 생략할 수 있지만, 여러줄일때는 {}와 return값이 필수이다.
        BooleanSupplier b = () -> {
          int random = (int) (Math.random() * 2);
          return random == 0 ? false : true;
        };

        System.out.println("랜덤 true or false : " + b.getAsBoolean());

        IntSupplier i = () -> (int) (Math.random() * 6) + 1;
        System.out.println("주사위 던져서 나온 수 : " + i.getAsInt());

    }

}
