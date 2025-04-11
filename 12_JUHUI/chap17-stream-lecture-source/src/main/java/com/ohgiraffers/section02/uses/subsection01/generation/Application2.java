package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {

        /*
         * range(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료값 전까지 범위의 스트림 생성
         * rangeClosed(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료값까지 범위의 스트림 생성
         */ // for문과 비슷

        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.print(value + " "));

        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5, 10);
        longStream.forEach(value -> System.out.print(value + " "));

        /*
         * Wrapper 클래스 자료형의 스트림으로 변환이 필요한 경우 boxing 할 수 있다.
         * doubles(갯수) : 난수를 활용한 DoubleStream을 갯수만큼 생성하여 반환한다.
         * boxed() : 기본 타입 스트림인 xxxStream을 박싱하여 Wrapper타입의 Stream<XXX>으로 반환한다.
         */
        System.out.println();
        Stream<Double> doubleStrema = new Random().doubles(5).boxed();
        doubleStrema.forEach(value -> System.out.print(value + " "));

        System.out.println();
        IntStream helloWorldChars = "hello world".chars();//.chars();는 toArrays와 비슷
        helloWorldChars.forEach(value -> System.out.print((char)value + " "));
        System.out.println();

        Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javascript");
        splitStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("hello", "world");
        Stream<String> stringStream2 = Stream.of("welcom", "to", "java");
//        stringStream.forEach(System.out::println);
//        stringStream2.forEach(System.out::println);

        // concat()을 이용해 두 개의 스트림을 동일 타입 스트림으로 합칠 수 있다.
        // 스트림은 1회성으로 사용 가능하며 이미 열린 스트림은 재사용이 불가능하다.
        Stream<String> concatStream = Stream.concat(stringStream, stringStream2);
        concatStream.forEach(val -> System.out.print(val + " "));
        //그래서 위에꺼 주석을 안하면 IllegalStateException이 발생한다.
        // 스트림은 한 번만 사용가능해서 위와 같이 다시 사용할 수 없어서 오류뜸.


    }
}
