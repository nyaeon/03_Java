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

        // 0부터 8까지의 숫자를 포함하는 IntStream 생성 (range는 끝값 미포함)
        IntStream intStream = IntStream.range(0, 9);
        // 짝수만 필터링하여 출력
        intStream.filter(i -> (i % 2) == 0).forEach(i -> System.out.print(i + " "));

    }
}
