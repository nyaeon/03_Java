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
        * */

        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.println(value + " "));

        System.out.println("====================================================");

        LongStream longstream = LongStream.rangeClosed(5, 10);
        longstream.forEach(value -> System.out.println(value + " "));

        /*
        * Wrapper 클래스 자료형의 스트림으로 변환이 필요한 경우 boxing 할 수 있다.
        * doubles(개수) : 난수를 활용한 DoubleStream 개수만큼 생성하여 변환한다.
        * boxed() : 기본 타입 스트림인 XXXStream을 박싱하여 Wrapper 타입의 Stream<XXX>으로 반환한다.
        * */

        System.out.println();
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.println(value + " "));

        System.out.println();
        IntStream helloworldChars = "LG TWINS".chars();
        helloworldChars.forEach(value -> System.out.println(value + " "));
        helloworldChars.forEach(value -> System.out.println((char)value + " "));
        System.out.println();

        Stream<String> splitSatream = Pattern.compile(",").splitAsStream("html, java, python");
        splitSatream.forEach(System.out::println);

        Stream<String> stringStream1 = Stream.of("hello", "world", "java");
        Stream<String> stringStream2 = Stream.of("hello", "world", "java");
        stringStream1.forEach(System.out::println);
        stringStream2.forEach(System.out::println);  // 이미 여기서 Stream을 사용했기 때문에 없어졌음. 다시 쓰려면 밑에 새로 만들어야 함

        // concat()을 이용하여 두 개의 스트림을 동일 타입 스트림으로 합칠 수 있다.
        // Stream은 1회성으로 사용 가능하며 이미 열린 스트림은 재사용이 불가능하다.
        // 위에 있는 것을 주석처리 하지 않으면 예외가 발생함
        Stream<String> stringStream3 = Stream.of("hello", "world", "java");
        Stream<String> stringStream4 = Stream.of("hello", "world", "java"); // 위에서 소멸됐기 때문에 같은 내용으로 Stream을 다시 만들어줌
        Stream<String> concatStream = Stream.concat(stringStream3, stringStream4);
        concatStream.forEach(value -> System.out.println(value + " "));






    }
}
