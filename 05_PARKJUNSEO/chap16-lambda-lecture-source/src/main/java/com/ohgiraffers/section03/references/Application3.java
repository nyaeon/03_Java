package com.ohgiraffers.section03.references;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {

        /*
        * Collection과 람다식 함께 사용
        * JDK8에 추가된  default 메소드 | Iterable:forEach
        * JDK8에 추가된  default 메소드 | Collection:removeIf
        * JDK8에 추가된  default 메소드 | List:replaceAll
        * */
        test1();

        /*
         * Map
         * JDK8에 추가된 default 메소드 Map:forEach
         * */
        test2();

    }
    public static void test1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
            for (Integer i : list) {
                System.out.println(i);
            };

        // 얘도 forEach 구문
        list.forEach(i -> System.out.println(i + " "));
        System.out.println();

        // 2의 배수 제거
        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);

        // 모든 요소에 10 곱하기
        list.replaceAll(i -> i + 10);
        System.out.println(list);

    }

    private static void test2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "홍창기");
        map.put(2, "문성주");
        map.put(3, "오스틴");
        map.put(4, "문보경");
        map.put(5, "김현수");
        map.put(6, "오지환");
        map.put(7, "박동원");
        map.put(8, "박해민");
        map.put(9, "신민재");
        System.out.println(map.getOrDefault(1, "홍길동"));
        System.out.println(map.getOrDefault(11, "임찬규"));

        // 해당 key가 존재하지 않을 경우 해당 key - value 생성
        map.computeIfAbsent(10,(k) -> "문정빈");
        System.out.println(map);

        // 해당 key가 존재한다면 수정할 수 있다.
        map.computeIfPresent(5, (k, v) -> "송찬의");
        System.out.println(map);

        map.compute(8, (k, v) -> (v == null) ? "박용택" : v+"(C)");
        map.compute(33, (k, v) -> (v == null) ? "박용택" : v+"!!!");
        System.out.println(map);

        map.forEach((k,v) -> System.out.println(k + ": " + v));

    }
}
