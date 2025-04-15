package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {

        /**
         * range(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자롷 종료값 전까지 범위의 스트림 생성
         * rangeClosed(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료갑까지 범위의 스트림 생성
         */

        // 5 ~ 9까지
        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();
        // 5 ~ 10까지
        LongStream longStream = LongStream.rangeClosed(5, 10);
        longStream.forEach(value -> System.out.print(value + " "));

        /**
         * Wrapper 클래스 자료형의 스트림으로 변환이 필요한 경우 boxing 할 수 있다.
         * doubles(갯수) : 난수를 활용한 DoubleStream을 갯수만큼 생성하여 반복한다.
         * boxed() : 기본 타입 스트림인 XXXStream을 박싱하여 Wrapper타입의 Stream<XXX>으로 반환한다.
         */
        System.out.println();
        // 0.0 이상 1.0 미만의 랜덤 double 값 5개 생성 후 boxed()로 Double 객체 스트림으로 변환
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + " "));

        System.out.println();
        // 문자열 "helloWorldChars"의 각 문자를 IntStream으로 변환하여 문자 단위로 출력
        IntStream helloworldChars = "helloWorldChars".chars();
        helloworldChars.forEach(value -> System.out.print((char) value + " "));

        System.out.println();
        // ", "(쉼표+공백)을 기준으로 문자열을 분리하여 스트림 생성
        Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javascript");
        splitStream.forEach(System.out::println);

        System.out.println("===============================");
        // 문자열 여러 개를 직접 넣어 스트림 생성
        Stream<String> stringStream = Stream.of("hello","world","java");
        Stream<String> stringStream2 = Stream.of("welcome","to","java");
        // 스트림은 사용하면 다시 재선언하기 전까지 재사용 할 수 없다.
//        stringStream.forEach(System.out::println);
//        stringStream2.forEach(System.out::println);

        // concat()을 이용하여 두개의 스트림을 동일 타입 스트림으로 합칠 수 있다.
        // 스트림은 사용하면 다시 재선언하기 전까지 재사용 할 수 없다.
        // stringStream, stringStream2을 forEach문을 통해 사용했기 때문에 다시 사용할 수 없다(그래서 stringStream1,2를 주석처리함)
        // illegalStateException 발생
        Stream<String> concatStream = Stream.concat(stringStream, stringStream2);
        concatStream.forEach(value -> System.out.print(value + " "));

    }

}
