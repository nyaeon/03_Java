package com.ohgiraffers.section03.refences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application3 {

    public static void main(String[] args){
        /*
        * Collection과 람다식 함께 사용
        *
        * JDK8에 추가된 default메소드 Iterable:forEach
        * JDK8에 추가된 default메소드 Collection:removeIf
        * JDK8에 추가된 default메소드 List:replaceAll
        * */
//        test1();
        test2();

        /*
        * Map
        * JDK8에 추가된 default 메소드 Map:forEach
        * */
    }

    private static void test1(){

        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            list.add(i + 1);
        }
//        for (Integer i : list){
//            System.out.println(i);
//        }
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 2의 배수를 지워준다.
        list.removeIf(i -> i % 2 == 0); // 만약 조건이 맞으면 해당 조건에 맞는 경우들을 지워준다.
        System.out.println(list);

        // 모든 요소에 10곱하기
        list.replaceAll(i -> i * 10);
        System.out.println(list);

//        list.removeIf(i -> i % 2 == 0).replaceAll(i -> i * 10) // 결과 값이 달라서 안됨

    }

    private static void test2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Davic");
        map.put(2,"Jack");
        map.put(3,"Kevin");
        map.put(4,"Brown");
        map.put(5,"Chris");

        System.out.println(map.getOrDefault(1,"홍길동"));
        System.out.println(map.getOrDefault(11,"홍길동"));

        // 해당 key가 존재하지 않을 경우 해당 key의 value 생성

        map.computeIfAbsent(10, (k) -> "JAMES");
        System.out.println(map);

        // 해당 key가 존재한다면 수정 할 수 있다.
        map.computeIfPresent(5, (k, v) -> "Karl");
        System.out.println(map);

        map.compute(3, (k, v) -> (v == null) ? "Ted" : v + "!!!");
        map.compute(33, (k, v) -> (v == null) ? "Ted" : v + "!!!");
        System.out.println(map);
        map.replaceAll((k,v)-> v.toUpperCase());
        map.forEach((k,v) -> System.out.println(k + " : " + v));

    }
}
