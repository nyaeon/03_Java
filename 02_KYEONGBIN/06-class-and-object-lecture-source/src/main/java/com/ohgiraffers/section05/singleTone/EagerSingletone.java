package com.ohgiraffers.section05.singleTone;

public class EagerSingletone {

    private static EagerSingletone eager = new EagerSingletone();

    EagerSingletone() {}

    public static EagerSingletone getInstance() {

        return eager;
    }

}
