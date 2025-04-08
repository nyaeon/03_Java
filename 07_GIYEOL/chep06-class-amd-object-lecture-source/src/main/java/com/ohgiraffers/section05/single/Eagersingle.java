package com.ohgiraffers.section05.single;

public class Eagersingle {
    private static Eagersingle eager = new Eagersingle();

    private Eagersingle() {}
    public static Eagersingle getEager() {
        return eager;
    }
}
