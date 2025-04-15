package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("hello", "world", "stream"));

        System.out.println("======================== foreach");
        for (String s : stringList) {
            System.out.println(s);
        }

        System.out.println("======================== stream");
        stringList.forEach(System.out::println);

        System.out.println("===============================");
        Stream<String> strinStream = stringList.stream();
    }
}
