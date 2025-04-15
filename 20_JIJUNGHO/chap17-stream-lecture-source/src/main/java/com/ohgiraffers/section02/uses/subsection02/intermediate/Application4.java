package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {

    public static void main(String[] args) {
        /*
         * Stream<T> sorted();
         *
         * Stream<T> sorted(Comparator<? super T> comparator);
         * sorted()은 인자가 없어도 호출이 가능한데,
         * 인자가 없으면 오름차순으로 자동정렬된다.
         * 별도의 비교 로직을 구현하고 싶다면 comparator를 인자로 넘겨주면된다.
         * */

        // sorted()를 활용한 오름차순 정렬
        List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 35)
                .boxed()
                .sorted().collect(Collectors.toList());

        System.out.println("integerList = " + integerList);



    }
}
