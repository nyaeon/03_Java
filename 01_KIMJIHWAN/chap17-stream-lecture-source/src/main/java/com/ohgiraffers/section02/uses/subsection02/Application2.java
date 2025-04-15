package com.ohgiraffers.section02.uses.subsection02;

import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {
        /*
         * Stream<R> map(Function<? super T, ? extends R> mapper);
         * 스트림에 들어있는 데이터를 특정 람다식을 통해 데이터를 가공하고 새로운 스트림에 담아주는 역할을 한다.
         * */

        IntStream intStream = IntStream.range(1, 10);
//        intStream.forEach(System.out::println);

        intStream
                .filter(i -> (i % 2) == 0)
                .map(i -> i * 5)
                .forEach( i -> System.out.print((i + " ")));

    }
}
