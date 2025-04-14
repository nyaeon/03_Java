package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {
        String[] sArr = new String[]{"java", "mysql", "jdbc"};
//        for(String s : sArr) {
//            System.out.println(s);
//        }
        // 위에 방법이 원래 보편적인 방법이지만 stream을 사용하면 밑에와 같이 쓰면 같은 결과를 가져올 수 있다.
        System.out.println("=======================================");
        Stream<String> strStream1 = Arrays.stream(sArr);
        strStream1.forEach(System.out::println);


        System.out.println("=======================================");
        Stream<String> strStream2 = Arrays.stream(sArr, 0, 2);
        strStream2.forEach(System.out::println);

        System.out.println("=======================================");
        List<String> stringList = Arrays.asList("html", "css", "javascript");

        Stream<String> strStream = stringList.stream(); // 다시 해보기
        strStream.forEach(System.out::println);

        System.out.println("=======================================");
        stringList.forEach(System.out::println); // 컬렉션의 경우 스트림 생성을 생략하고 사용할 수 있다.

        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("유관순")
                .build(); // 리스트 만들어서 요소 3개를 이러한 방법으로 해결할 수 있음.

        builderStream.forEach(System.out::println);
        System.out.println();

        Stream<Integer> builderStream2 = Stream.<Integer>builder()
                .add(1)
                .add(2)
                .add(3)
                .build(); // 리스트 만들어서 요소 3개를 이러한 방법으로 해결할 수 있음.

        builderStream2.forEach(System.out::println);
        System.out.println();

        Stream<Integer> intStream = Stream.iterate(10, value -> value * 2).limit(10);
        intStream.forEach(value -> System.out.print(value + " "));
    }
}
