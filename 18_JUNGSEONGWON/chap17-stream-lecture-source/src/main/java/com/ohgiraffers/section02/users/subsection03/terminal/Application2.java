package com.ohgiraffers.section02.users.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {
        /*
         * reduce
         * Optional<T> reduce(BinaryOperator<T> accumulator);
         * T reduce(T identity, BinaryOperator<T> accumulator);
         * U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
         * reduce()라는 메소드는 스트림에 있는 데이터들의 총합을 계산해준다.
         * */

        // 인자가 1개 인 경우
        OptionalInt reduceOneParam = IntStream.range(1, 4)
                                    .reduce((a, b) -> Integer.sum(a, b));//1,2,3
        System.out.println("reduceOneParam = " + reduceOneParam.getAsInt());
        
        // 인자가 2개 인 경우
        
        int reducdTwoParam = IntStream.range(1,4)
                            .reduce(100,Integer::sum);
        System.out.println("reducdTwoParam = " + reducdTwoParam);
        
        // 인자가 3개 인경우        /*
        //        * reduce
        //        * Optional<T> reduce(BinaryOperator<T> accumulator);
        //        * T reduce(T identity, BinaryOperator<T> accumulator);
        //        * U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
        //        * reduce()라는 메소드는 스트림에 있는 데이터들의 총합을 계산해준다.
        //        * */
        
        Integer reduceThreeParam = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                                  .reduce(100,Integer::sum,(x,y) -> x+y);
        System.out.println("reduceThreeParam = " + reduceThreeParam);
    }
}
