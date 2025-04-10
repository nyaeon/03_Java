package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;
import com.ohgiraffers.section01.list.dto.PersonDTO;

import javax.xml.stream.StreamFilter;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        HashMap hMap = new HashMap();
        hMap.put("one", new Date());
        hMap.put(12, "red apple");
        hMap.put(33, 123);
        System.out.println("hMap = " + hMap);
        hMap.put(12, "yellow banana"); // 동일한 키값으로 다른 값을 대입하면 이전에 있던 값을 수정한다.
        System.out.println("hMap = " + hMap);
        hMap.put(11, "yellow banana");
        hMap.put(14, "yellow banana");
        System.out.println("hMap = " + hMap);

        System.out.println(hMap.get(33));
        System.out.println("=============================");
        Map<Object, Object> hmap = new HashMap();
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);
        System.out.println(hmap.get("one"));
        System.out.println("hmap의 toString() : " + hmap.toString());

        hmap.put(new BookDTO(1, "홍길동전", "허균", 50000), "허균의 홍길동전이면 오에");
        System.out.println("map의 키 값으로 활용되는 객체를 활용 : "
        + hmap.get(new BookDTO(1, "홍길동전", "허균", 50000)));
        System.out.println("Map이 갖고 있는 entry의 수 : " + hmap.size());
        System.out.println("\"one\"이라는 키값을 가진 entry 삭제 = " + hmap.remove("one"));
        System.out.println("hmap = " + hmap);
        Map<String, String> hmap2 = new HashMap();
        hmap2.put("one", "java 17");
        hmap2.put("two", "MySQL 8.4");
        hmap2.put("three", "jsp/servlet");
        hmap2.put("four", "springboot 3.0");
        hmap2.put("five", "react.js");

        // 1. keySet()을 이용해서 키만 따로 set으로 만들고, iterator()로 키에 대한 목록 만듦
        Iterator<String> keyIter = hmap2.keySet().iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);

            System.out.println(key + " : " + value);

        // 2. 저장된 value객체들만 values()로 Collection으로 만듦
            Collection<String> values = hmap2.values();
            Iterator<String> iterator = values.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            Object[] array = values.toArray();
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

        // Map의 내부클래스인 EntrySet을 이용 : entrySet()
        Set<Map.Entry<String, String>> entries = hmap2.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String, Object> hmap3 = new HashMap<>();
        hmap3.put("book", new BookDTO());
        hmap3.put("person", new PersonDTO());

        System.out.println(hmap3.get("book"));

        ArrayList<BookDTO> bList = new ArrayList<>();
        hmap3.put("bList", bList);
        ArrayList<PersonDTO> pList = new ArrayList<>();
        hmap3.put("pList", pList);
        System.out.println(hmap3);


    }
}
