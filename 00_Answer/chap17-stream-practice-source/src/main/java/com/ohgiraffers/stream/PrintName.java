package com.ohgiraffers.stream;

import java.util.List;

public class PrintName {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Franklin");

        names.stream()
                .filter(name -> name.length() >= 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
