package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {
        /*
         * Stream<R> map(Function<? super T, ? extends R> mapper);
         * 스트림에 들어있는 데이터를 특정 람다식을 통해 데이터를 가공하고 새로운 스트림에 담아주는 역할을 한다.
         * 스트림 안의 데이터를 다른 형태로 바꾸는 것
         * */

        // 1부터 9까지의 숫자를 포함하는 IntStream 생성 (range는 끝값 미포함)
        IntStream intStream = IntStream.range(1, 10);
        //        intStream.forEach(System.out::println);
        // 짝수만 필터링하고, 각 값을 5배한 후 출력
        intStream
                .filter(i -> i % 2 == 0) // 짝수만 필터링
                .map(i -> i * 5) // 필터링된 값에 * 5
                .forEach(i -> System.out.print(i + " ")); // 출력

    }
}
