package com.ohgiraffers.stream;

import java.util.List;

public class FilterAndJoinStrings {

    public static void main(String[] args) {
        // 문제: 길이가 3 이상인 문자열만 골라 쉼표로 연결하여 출력하세요.
        List<String> words = List.of("hi", "hello", "to", "world", "java");
        // 출력값
        // hello, world, java
        System.out.println();

        System.out.println(words.stream().filter((s) -> s.length() >= 3)
            .reduce((s1, s2) -> s1 + ", " + s2).get());
    }
}
