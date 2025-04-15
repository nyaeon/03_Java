package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {
        /*
         * Stream<R> map(Function<? super T, ? extends R> mapper);
         * 스트림에 들어있는 데이터를 특정 람다식을 통해 데이터를 가공하고 새로운 스트림에 담아주는 역할을 한다.
         * */
        IntStream intStream = IntStream.range(1, 10);
        //intStream.forEach(System.out::println); //스트림은 한 번만 사용가능하니까 나중을 위해 주석처리

        intStream
                .filter(i-> (i % 2) == 0)
                .map(i -> i * 5) // 값을 재정의해서 다시 넣어줄 때 사용
                .forEach(i->System.out.print(i + " "));


    }
}
