package com.ohgiraffers.section02.user.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        long count = IntStream.range(1, 10).count();
        long sum = IntStream.range(1, 10).sum();
        System.out.println("count : " + count);
        System.out.println("sum : " + sum);

        OptionalInt max = IntStream.range(1, 10).max();
        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("max : " + max.getAsInt());
        System.out.println("min : " + min.getAsInt());


        int oddsum = IntStream.range(1, 10).filter(i -> i % 2 == 0).sum();
        System.out.println("oddsum : " + oddsum);




    }
}
