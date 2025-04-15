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

        // 리스트 안에 리스트가 있는거고, 배열안에 배열있는거
        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA","SPRING","SPRINGBOOT"),
                Arrays.asList("java","spring","springboot")
        );
        System.out.println("List: " + list);
        // 결과 : [[JAVA, SPRING, SPRINGBOOT], [java, spring, springboot]] 이걸 한 세트로 만들어주고 싶음.

        List<String> flatList = list.stream()
                .flatMap(Collection::stream) //컬렉션 클래스 안에 스트림 메소드를 가지고 있겠다
                .collect(Collectors.toList()); // 리스트 타입으로 만들어줄게
        System.out.println("FlatList: " + flatList); // 이러면 이쁘게 합쳐짐.
        // 결과 : [JAVA, SPRING, SPRINGBOOT, java, spring, springboot]
    }
}
