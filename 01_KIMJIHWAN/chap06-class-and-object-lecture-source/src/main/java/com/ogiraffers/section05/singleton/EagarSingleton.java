package com.ogiraffers.section05.singleton;

public class EagarSingleton {

    private static EagarSingleton eagar = new EagarSingleton();

    private EagarSingleton() {}

    public static EagarSingleton getInstance() {    // ++ 가져다 쓸 수는 있다.
        return eagar;
    }
}
