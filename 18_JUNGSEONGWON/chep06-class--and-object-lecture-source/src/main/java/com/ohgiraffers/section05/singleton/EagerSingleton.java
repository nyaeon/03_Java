package com.ohgiraffers.section05.singleton;

public class EagerSingleton {

    private static final EagerSingleton eager = new EagerSingleton();

    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return eager;
    }
}
