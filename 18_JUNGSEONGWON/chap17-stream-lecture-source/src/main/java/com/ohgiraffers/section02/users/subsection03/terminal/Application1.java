package com.ohgiraffers.section02.users.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args){

        long count = IntStream.range(1,10).count();
        long sum = IntStream.range(1, 10).sum();
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        OptionalInt max = IntStream.range(1,10).max();
        OptionalInt min = IntStream.range(1,10).min();
        System.out.println("max.getAsInt() = " + max.getAsInt()); //getAsInt를 사용해서 안의 있는 값 호출
        System.out.println("min = " + min); // 사용 안한거

        int oddSum = IntStream.range(1,10).filter(i -> i % 2 == 1).sum();
        System.out.println("oddSum = " + oddSum);
    }
}
