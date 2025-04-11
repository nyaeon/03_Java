package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        /*
         * Stream<T> filter(Predicate<? super T> predicate);
         * 필터(Filter)는 스트림에서 특정 데이터만 걸러내는 메소드이다.
         * 매개변수로 받는 Predicate는 boolean을 리턴하는 함수형
         * 인터페이스이다.
         * */

        IntStream intStream = IntStream.range(0, 10);
        intStream.filter(i -> (i % 2) == 0).forEach(i -> System.out.print(i + " "));
    }
}
