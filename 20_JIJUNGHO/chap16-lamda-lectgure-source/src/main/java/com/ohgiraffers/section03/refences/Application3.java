package com.ohgiraffers.section03.refences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application3 {

    public static void main(String[] args) {
        /**
         * Collection과 람다식 함께 사용
         *
         * JDK8에 추가된 default 메소드 Iterable:forEach
         * JDK8에 추가된 default 메소드 Collection:removeIf
         * JDK8에 추가된 default 메소드 List:replaceAll
         */
        //        test1();
        /**
         * Map
         * JDK8에 추가된 default 메소드 Map:forEach
         */
        test2();
    }

    private static void test1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

        //        for (Integer i : list) {
        //            System.out.println(i);
        //        }

        // 람다식 표현
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 조건에 맞는 값을 지움 (짝수만 제거)
        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);

        // 모든 요소에 10을 곱하기
        list.replaceAll(i -> i * 10);
        System.out.println(list);

        // list.removeIf(i -> i % 2 == 0).replaceAll(i -> i * 10); // 안됨
    }

    private static void test2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Davic");
        map.put(2, "Jack");
        map.put(3, "Peter");
        map.put(4, "Brown");
        map.put(5, "Chris");

        // getOrDefault() : key값을 찾고, 없으면 디폴트값으로 반환하고, 있으면 기본값 반환
        // 1이라는 키값을 찾고, 없으면 디폴트값으로 반환하고, 있으면 원래 있는 값 반환
        System.out.println(map.getOrDefault(1, "홍길동"));
        System.out.println(map.getOrDefault(11, "홍길동"));

        // computeIfAbsent() : 해당 key가 존재하지 안을 경우 해당 key - value 생성
        // 10이라는 key가 존재하지 않으면, 10이라는 key와 james라는 value 생성
        map.computeIfAbsent(10, ((k) -> "James"));
        System.out.println(map);

        // 해당 key가 있으면, 수정
        map.computeIfPresent(5, (k, v) -> "Kari");
        System.out.println(map);

        // key 기반으로 값을 계산해서 map에 넣을 수 있게 해주는 업데이트
        map.compute(3, (k,v) -> (v ==null) ? "Ted" : "!!!");
        map.compute(33, (k,v) -> (v ==null) ? "Ted" : "!!!");   
        System.out.println(map);

        // map의 모든 값을 대문자로 변환
        map.replaceAll((k, v) -> v.toUpperCase());

        // map의 모든 키와 값을 출력 (형식: key : value)
        map.forEach((k,v ) -> System.out.println(k + " : " + v));


    }

}
