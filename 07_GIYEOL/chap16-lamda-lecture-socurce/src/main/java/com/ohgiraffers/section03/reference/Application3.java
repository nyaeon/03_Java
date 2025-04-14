package com.ohgiraffers.section03.reference;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application3 {
    public static void main(String[] args) {
        /***
         * collection과 람다식 함께 사용
         *
         * JDK8에 추가된 default 메소드 Iterable:foreach
         * JDK8에 추가된 default 메소드 collection:removeIF
         * JDK8에 추가된 default 메소드 List:replaceALl
         */
      //  test1();
        /***
         * Map
         * JDK8에 추가된 default 메소드 mpa:forEach
         */
        test2();
    }
    private static void test1() {
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
    //    for (Integer i : list) {
    //         System.out.println(i);
    //     }
        list.forEach(i-> System.out.println(i + " "));
        System.out.println();

        //2의 배수 삭제
        list.removeIf(i -> i%2==0);
        System.out.println(list);

        //모든 요소에 10곱하기
        list.replaceAll(i -> i*10);
        System.out.println(list);

      //  list.removeIf(i -> i%2==0).replaceALl(i -> i *10)오류

    }
    private static void test2() {
        Map<Integer, String> map= new HashMap<>();
        map.put(1, "Davic");
        map.put(2, "Dave");
        map.put(3, "peter");
        map.put(4, "brown");
        map.put(5, "chris");

        System.out.println(map.getOrDefault(1, "홍길동"));
        System.out.println(map.getOrDefault(11, "홍길동"));
        //해당 키가 존재하지 않을 경우 해당 key - value생성
        map.computeIfAbsent(10,(k)-> "james");

        System.out.println(map);
        //해당 키가 있다면 수정 가능
        map.computeIfPresent(5,(k,v)-> "karl");
        System.out.println(map);

        map.compute(3,(k,v)-> (v == null) ? "jim" : v + "!!!");
        map.compute(33,(k,v)-> (v == null) ? "jim" : v + "!!!");
        System.out.println(map);

        map.replaceAll((k,v)-> v.toUpperCase());
        map.forEach((k,v)-> System.out.println(k + ": " + v));

    }
}
