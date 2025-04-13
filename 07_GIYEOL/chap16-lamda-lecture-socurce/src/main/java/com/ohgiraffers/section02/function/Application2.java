package com.ohgiraffers.section02.function;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Application2 {
    public static void main(String[] args) {

        Supplier<LocalDateTime> s = new Supplier<LocalDateTime>() {
            @Override
            public LocalDateTime get() {
                return LocalDateTime.now();
            }
        };

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        BooleanSupplier b = () -> {
          int random = (int)(Math.random()*2);
          return random == 0? false: true;
        };
        System.out.println("랜덤 참과 거짓 :" +  b.getAsBoolean());

        IntSupplier intSupplier = () -> (int)(Math.random()*6) +1;
        System.out.println("나온 수 : " + intSupplier.getAsInt());
    }
}
