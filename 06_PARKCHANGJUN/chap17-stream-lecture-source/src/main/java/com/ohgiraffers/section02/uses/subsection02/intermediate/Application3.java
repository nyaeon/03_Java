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
         */
        // 리스트안에 리스트가 있는 것
        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "spring-boot")
        );
        System.out.println("List: " + list); // 배열안에 배열이 만들어짐

        List<String> flatList = list.stream()
                                    .flatMap(Collection::stream) // Collection 클래스 안에 있는 stream 메소드를 호출하는 코드
                                    .collect(Collectors.toList());
        System.out.println("FlatList: " + flatList);
    }
}
