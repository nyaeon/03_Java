package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {
        String[] sarr = new String[] {"java","mysql","jdbc"};
        for (String s : sarr) {
            System.out.println(s);
        }

        System.out.println("=========================");
        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(System.out::println);

        System.out.println("=========================");
        Stream<String> strStream2 = Arrays.stream(sarr,0,2);
        strStream2.forEach(System.out::println);
        System.out.println("=========================");

        List<String> stringList2 = Arrays.asList("html","css","javascript");
        stringList2.forEach(System.out::println);
        System.out.println("=========================");
        stringList2.forEach(System.out::println);// 컬렉션의 경우 스트림 생성을 생략하고 사용할 수 있다.

        Stream<String> builderStream = Stream.<String >builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길").build();

        builderStream.forEach(System.out::println);

        Stream<Integer> builderStream2 = Stream.<Integer >builder()
                .add(1)
                .add(2)
                .add(3).build();
        builderStream2.forEach(System.out::println);

        Stream<Integer> intStream = Stream.iterate(10,value -> value * 2).limit(10);
        intStream.forEach(value -> System.out.print(value + " "));
    }
}
