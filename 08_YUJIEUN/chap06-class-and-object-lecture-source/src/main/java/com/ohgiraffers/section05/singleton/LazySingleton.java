package com.ohgiraffers.section05.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySingleton();
        }

        return lazy;
    }

}