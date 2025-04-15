package com.ohgiraffers.section02.uses.subsection03.terminal;

import javax.swing.text.html.Option;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {

        long count = IntStream.range(1, 10).count();
        long sum = IntStream.range(1, 10).sum();

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        /*
        * Optional: Java에서 null 값을 안전하게 처리하기 위해 사용하는 래퍼 클래스
        * Optional<T>는 T 타입의 값을 감싸는 컨테이너. 값이 있을 수도 있고 없을 수도 있어(null일 수도 있다는 뜻).
        * 그래서 if문으로 null 체크하는 번거로움을 줄이고, 명시적으로 "값이 없을 수 있음"을 표현
        * */
        OptionalInt max = IntStream.range(1, 10).max();
        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("max = " + max.getAsInt());
        System.out.println("min = " + min.getAsInt());

        System.out.println("=======================================");

        int oddSum = IntStream.range(1,10).filter(i -> (i%2) == 1).sum();
        System.out.println("oddSum = " + oddSum);

    }
}
    