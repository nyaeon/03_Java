package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {

        long count = IntStream.range(1, 10).count();
        long sum = IntStream.range(1, 10).sum();
        System.out.println("count = " + count); // 9
        System.out.println("sum = " + sum); // 45
        
        OptionalInt max = IntStream.range(1, 10).max();
        OptionalInt min = IntStream.range(1, 10).min();
        // getAsInt() : 숫자값만 출력
        System.out.println("max = " + max); // OptionalInt[9]
        System.out.println("min = " + min); // OptionalInt[1]

        // 홀수의 합 출력
        int oddSum = IntStream.range(1, 10).filter(i -> i % 2 == 1).sum();
        System.out.println("oddSum = " + oddSum); // 25


    }
}
