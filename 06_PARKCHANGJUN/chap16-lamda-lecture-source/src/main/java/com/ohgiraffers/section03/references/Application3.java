package com.ohgiraffers.section03.references;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application3 {

    public static void main(String[] args) {

        /*
         * Collection과 람다식 함께 사용
         *
         * JDK8에 추가된 default메소드 Iterable:forEach
         * JDK8에 추가된 default메소드 Collection:removeIf
         * JDK8에 추가된 default메소드 List:replaceAll
         */
//        test1();

        /*
         * Map
         * JDK8에 추가된 default메소드 Map:forEach
         */
        test2();

    }

    private static void test1() {

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        
//        for(Integer i : list) {
//            System.out.println("i = " + i);
//        }

        // 위에랑 같은결과. forEach에 람다식을 적용하면 가능.
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 만약 내가 넣어준 조건이 맞으면 지워달라는 코드
        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);

        // 모든 요소에 10곱하기
        list.replaceAll(i -> i * 10);
        System.out.println(list);

//        list.removeIf(i -> i % 2 == 0).replaceAll(i -> i * 10); // 안됨
    }

    private static void test2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Davic");
        map.put(2, "Jack");
        map.put(3, "Peter");
        map.put(4, "Brown");
        map.put(5, "Chris");

        // 1을 찾았는데 맵 객체에 없으면 "홍길동" 같은 값을 준다는 것이다.
        System.out.println(map.getOrDefault(1, "홍길동"));
        System.out.println(map.getOrDefault(11, "홍길동"));

        // 해당 key가 존재하지 않을 경우 해당 key - value 생성
        map.computeIfAbsent(10, (k) -> "james");
        System.out.println(map);

        // 해당 key가 존재한다면 수정할 수 있다.
        map.computeIfPresent(5, (k, v) -> "Karl");
        System.out.println(map);


        map.compute(3, (k, v) -> (v == null) ? "Ted" : v + "!!!"); // 산술연산자 사용
        map.compute(33, (k, v) -> (v == null) ? "Ted" : v + "!!!");
        System.out.println(map);

        // forEach는 리스트에만 있는게 아니라 map에도 있다.
        map.replaceAll((k, v) -> v.toUpperCase());
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
