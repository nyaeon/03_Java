package com.ohgiraffers.stream;

import java.util.List;

public class PrintName {

    // 문제: 이름 리스트에서 길이가 5글자 이상인 이름만 골라 대문자로 바꾸고 출력
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Franklin");


        names.stream()
                        .filter(name-> name.length() >=5)
                        .map(String :: toUpperCase)
                        .forEach(System.out::println);

    }
}
