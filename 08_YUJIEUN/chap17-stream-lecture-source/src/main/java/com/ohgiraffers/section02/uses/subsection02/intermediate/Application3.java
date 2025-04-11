package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        /*
         * Stream<R> flatMap(Function<? super T, ? extends Stream<? extendsR>> mapper);
         * flatMap()는 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어준다.
         *
         * 이러한 작업을 플래트닝(flattening)이라고 한다.
         * */

        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA","SPRING","SPRINGBOOT"),
                Arrays.asList("java","spring","spring-boot")
        );

        System.out.println("list: " + list);

        List<String> flatlist = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("flatlist = " + flatlist);









    }
}
