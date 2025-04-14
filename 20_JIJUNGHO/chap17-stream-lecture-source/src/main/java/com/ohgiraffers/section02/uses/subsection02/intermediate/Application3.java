package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.ArrayList;
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

        //  flatMap()을 이용해서 이중 리스트(List<List<>>) 를 하나의 평평한 리스트로 펼쳐(flatten) 주는 대표적인 예제
        // 이중 리스트 생성 (대문자/소문자 각각의 문자열 리스트)
        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "springboot")
        );
        System.out.println("list = " + list); // 이중 리스트 출력

        // flatMap을 이용해 내부 리스트들을 하나의 평면 리스트로 변환
        List<String> flatList = list.stream()
                .flatMap(Collection::stream) // 각 내부 리스트를 스트림으로 펼침
                .collect(Collectors.toList()); // 최종적으로 하나의 리스트로 수집
        System.out.println("flatList = " + flatList);

    }
}
