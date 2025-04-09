package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.time.LocalDateTime;
import java.util.*;

import static java.time.chrono.JapaneseEra.values;

public class Application1 {

    public static void main(String[] args) {

        HashMap hmap = new HashMap();    // Map도 ArrayList처럼 타입 다 받아줌

        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);
        System.out.println(hmap);       // 순서는 중요하지 않음  // 얘는 인덱스 대신 키값이 있음

        hmap.put(12, "yellow banana");      // 동일한 키값으로 다른 값을 대입하면 이전에 있던 값을 수정한다. (덮어써버림)
        System.out.println(hmap);

        hmap.put(11, "yellow banana");      // 같은 값이지만 키값이 다르기 때문에 새롭게 추가됨
        System.out.println(hmap);

        System.out.println(hmap.get(11));   // 키값을 대입하면 그에 상응하는 값을 출력함
        System.out.println(hmap.get(34));   // 없는 키값을 대입하면 null 값이 나옴

// ========================================================================================================

        Map<Object, Object> hMap = new HashMap<>();
        hMap.put("one", new Date());
        hMap.put(12, "red apple");
        hMap.put(33, 123);

        System.out.println(hMap.get("one"));
        System.out.println("hMap의 toString() : " + hMap.toString());

        hMap.put(new BookDTO(1, "홍길동전", "허균", 50000), "허균의 홍길동전이라면 오케이");
      //  System.out.println("map의 키 값으로 활용되는 객체를 이용 : " + hM);

        System.out.println("hMap이 가지고 있는 entry의 수 : " + hMap.size());
        System.out.println("\"one\"이라는 키값을 가진 entry 삭제 : " + hMap.remove("one"));
        System.out.println(hMap);

        Map<String, String> hMap2 = new HashMap();
        hMap2.put("one", "red apple");
        hMap2.put("two", "blue apple");
        hMap2.put("three", "green apple");
        hMap2.put("four", "yellow apple");
        hMap2.put("five", "orange apple");

        // 1. keySet()을 이용해서 키만 따로 set으로 만들고, iterator()로 키에 대한 목록 만들기
        Iterator<String> keyIte = hMap2.keySet().iterator();
        while (keyIte.hasNext()) {
            String key = keyIte.next();
            String value = hMap2.get(key);

            System.out.println(key + " = " + value);
        }

//        // 2. 저장된 value 객체들만 values()로 Collection으로 만듦
//        Collection<String> iterator = hMap2.values();
//        while (iterator.hasNext()) {
//            System.out.println();
//        }
//
//        Object[] array2 = values.toArray();
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(array2[i]);
//        }
//
//        // Map의 내부클래스인 EntrySet을 이용 : entrySet()




    }
}
