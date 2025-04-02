package com.ohgiraffers.section05.singleton;

public class LazySingleton {

    private static LazySingleton lazy; // 처음에 생성하면 null로 초기화.

    private LazySingleton getInstance() {
        if(lazy == null) {
            lazy = new LazySingleton();
        }

        return lazy;
    }

}
