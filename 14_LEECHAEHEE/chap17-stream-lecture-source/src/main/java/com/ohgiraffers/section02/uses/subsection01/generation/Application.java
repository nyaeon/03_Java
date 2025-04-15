package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        String[] sArr = new String[] {"java", "mysql", "jdbc"};
        for (String str : sArr) {
            System.out.println(str);
        }
        System.out.println("=======================");

        Stream<String> strStream1 = Arrays.stream(sArr);
        strStream1.forEach(System.out::println);
        System.out.println("=======================");
        Stream<String> strStream2 = Arrays.stream(sArr, 0, 1);
        strStream2.forEach(System.out::println);
        System.out.println("==========================");
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        Stream<String> stream = stringList.stream();
        stream.forEach(System.out::println);
        System.out.println("========================");
        stringList.forEach(System.out::println);  // 컬렉션의 경우 스트림 생성을 생략하고 사용할 수 있다

        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길").build();
        builderStream.forEach(System.out::println);

        Stream<Integer> intStream = Stream.iterate(10, value -> value * 2).limit(10);
        intStream.forEach(System.out::println);
    }
}
