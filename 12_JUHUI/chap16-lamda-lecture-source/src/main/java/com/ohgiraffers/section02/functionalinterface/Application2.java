package com.ohgiraffers.section02.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Application2 {

    public static void main(String[] args) {
        //인터페이스를 내부에서 활용해 리턴
        Supplier<LocalDateTime> s = new Supplier<LocalDateTime>() {
            @Override
            public LocalDateTime get() {
                return null;
            }
        };

        //람다식으로 바꾼, 위와 같은 방식인데 다른 표현.
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        BooleanSupplier booleanSupplier = () -> {
            // 중괄호를 열고 닫았다는 건 여러 줄 쓰겠다는 뜻.
            int random = (int) (Math.random() * 2); //0과 1.
            return random == 0 ? false : true;
        };

        System.out.println("랜덤 true or false : " + booleanSupplier.getAsBoolean());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("주사위를 던져서 나온 수 : " + intSupplier.getAsInt());
    }
}



