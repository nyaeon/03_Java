package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        String[] sarr = new String[] {"java", "mysql", "jdbc"};
        for (String s : sarr) {
            System.out.println(s);
        }

        System.out.println("====================================");
        Stream<String> stringStream1 = Arrays.stream(sarr);
        stringStream1.forEach(System.out::println);

        System.out.println("====================================");
        Stream<String> strStream2 = Arrays.stream(sarr, 0,  2);
        strStream2.forEach(System.out::println);

        System.out.println("====================================");
        List<String> stringList = Arrays.asList("java", "mysql", "jdbc");

        Stream<String> stream = stringList.stream();    // 위에서 리스트로 만들었기 때문에 굳이 이렇게 하지 않아도 됨
        stream.forEach(System.out::println);
        System.out.println("====================================");
        stringList.forEach(System.out::println); // 컬렉션의 경우 스트림 생성을 생략하고 사용할 수 있음.

        Stream<String> builderStream1 = Stream.<String>builder()
                .add("홍창기")
                .add("오지환")
                .add("임찬규").build();

        builderStream1.forEach(System.out::println);

        System.out.println("==========================================================");

        Stream<Integer> builderStream2 = Stream.<Integer>builder()
                .add(1)
                .add(2)
                .add(3).build();

        builderStream2.forEach(System.out::println);

        System.out.println("==========================================================");
        Stream<Integer> intStream = Stream.iterate(10, value -> value*2).limit(10);
        intStream.forEach(value -> System.out.println(value + " "));
    }
}
