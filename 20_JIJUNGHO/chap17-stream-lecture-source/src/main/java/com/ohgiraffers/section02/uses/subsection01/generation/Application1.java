package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {
        String[] sarr = new String[]{"java", "mysql", "jdbc"};
        for (String s : sarr) {
            System.out.println(s);
        }

        // sarr 값 전체 조회
        System.out.println("=================== stream");
        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(System.out::println);

        System.out.println("===================");
        // 배열 sarr의 0번 인덱스부터 1번 인덱스 전까지(즉, 0번만) 스트림 생성
        Stream<String> strStream2 = Arrays.stream(sarr, 0, 1);
        strStream2.forEach(System.out::println);

        // List 컬렉션에서 스트림을 생성하여 요소 출력하는 예제
        // 스트림 사용 방식과 컬렉션의 직접 출력 방식 비교
        System.out.println("===================");
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        Stream<String> stream = stringList.stream();
        stream.forEach(System.out::println);

        System.out.println("===================");
        stringList.forEach(System.out::println); // 컬렉션의 경우 스트림 생성을 생략하고 사용할 수 있다.

        // Stream.builder()를 사용하여 문자열 스트림 직접 생성
        // 요소 3개를 스트림에 저장
        Stream<String> builderStream = Stream.<String>builder()
        .add("홍길동")
        .add("유관순")
        .add("윤봉길").build();
        builderStream.forEach(System.out::println);

        // Stream.builder()를 사용하여 정수 스트림 직접 생성
        Stream<Integer> builderStream2 = Stream.<Integer>builder()
                .add(1)
                .add(2)
                .add(3).build();
        builderStream2.forEach(System.out::println);

        System.out.println("===================");
        // 초기값 10부터 시작해 값에 *2를 반복하여 10개까지 생성하는 스트림
        Stream<Integer> intStream = Stream.iterate(10, value -> value * 2).limit(10);
        intStream.forEach(value -> System.out.print(value + " " ));
    }
}
