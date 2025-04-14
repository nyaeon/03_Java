package com.ohgiraffers.section02.user.section01.generation;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        /***
         * range(시작값,종료값) : 시작값부터 1씩 증가하는 숫자로 종료값 전까지 범위의 스트림 생성
         * rangeClosed(시작값,종료값) : 시작값부터 1씩 증가하는 숫자로 종료값까지 범위의 스트림 생성
         */
      // Scanner scanner = new Scanner(System.in);
      // int i = scanner.nextInt();
        IntStream intstream = IntStream.range(5,10);
        intstream.forEach(val -> System.out.print(val+" "));

        System.out.println();
        LongStream longstream = LongStream.rangeClosed(5, 10);
        longstream.forEach(val -> System.out.print(val+" "));

        /**
         * Wrapper클래스 자료형의 스트림으로 변환이 필요한 경우 boxing 할 수 있다
         * doubles(갯수) : 난수를 활용한 DoubleStream을 갯수만큼 생성하여 반환
         * boxed() :기본 타입 스트림인 xxx stream을 박싱하여 wrapper 타입의 stream<xxx>로 반환
         */

        System.out.println();
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(val -> System.out.print(val+" "));

        System.out.println();
        IntStream helloworld = "Hello World".chars();
        helloworld.forEach(value -> System.out.print((char)value+" "));
        System.out.println();

        Stream<String> split = Pattern.compile(",").splitAsStream("html ,css,javascript");
        split.forEach(System.out::println);
        System.out.println();

        Stream<String> stringStream = Stream.of("Hello", "World","Java");
        Stream<String> stringStream2 = Stream.of("Hiei", "Wooo","kkkk");
    //    stringStream.forEach(System.out::println);
    //    System.out.println();

        //concat() 을 이용하여 두개의 스트림을 동일 타입 스트림으로 합칠 수 있다
        //스트림은 1회성으로 사용 가능하며 이미 열린 스트림은 재사용이 불가하다
        // 먼저 출력 내용을 주석으로 변경하지 않으면 IllegalStateException 오류 발생
        Stream<String> concat = Stream.concat(stringStream, stringStream2);
        concat.forEach(value-> System.out.print(value+" "));

    }
}
