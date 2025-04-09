package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;
import com.ohgiraffers.section01.list.dto.PersonDTO;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        // HashMap 객체 생성
        HashMap hmap = new HashMap();

        // 값 추가
        hmap.put("one", new Date());
        hmap.put(12, "redApple");
        hmap.put(33, 123);

        System.out.println(hmap);

        // 동일한 키값으로 value을 추가하면, 이전에 있던 value값을 수정
        hmap.put(12, "yellow banana");
        System.out.println("hmap = " + hmap);

        // key값이 중복안되면, value값은 중복 할 수 있음
        hmap.put(11, "yeelow banana");
        System.out.println("hmap = " + hmap);

        // key값으로 value값을 조회할 수 잇음
        System.out.println(hmap.get("one"));

        System.out.println("=====================================");

        Map<Object, Object> hMap = new HashMap<>();

        hMap.put("one", new Date());
        hMap.put(12, "redApple");
        hMap.put(33, 123);

        System.out.println(hMap.get("one"));
        System.out.println("hMap의 toString() : " + hMap.toString());

        hMap.put(new BookDTO(1, "홍길동전", "허균", 50000), "허균의 홍길동전이면 오케이!~");

        System.out.println("hMap의 키 값으로 활용되는 객체를 활용 = " + hMap.get(new BookDTO(1, "홍길동전", "허균", 50000)));

        System.out.println("hMapdl 가지고 있는 entry의 수 : " + hMap.size());

        System.out.println("\"one\"이라는 키값을 가진 entry 삭제" + hMap.remove("one"));
        System.out.println("hMap = " + hMap);

        Map<String, String> hMap2 = new HashMap();
        hMap2.put("one", "java 17");
        hMap2.put("two", "mySql");
        hMap2.put("three", "servlet/jsp");
        hMap2.put("four", "springboot3.0");
        hMap2.put("five", "react");

        // 1. keySet()을 이용ㅎ서 키만 따로 set으로 만들고, iterator()로 키에 대한 목록 만듬 (key 값만 출력)
        Iterator<String> keyIter = hMap2.keySet().iterator();

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hMap2.get(key);

            System.out.println(key + " : " + value);
        }

        // 2. 저장된 value 객체들만 values()로 Collection으로 만듬 (valus값만 출력)
        Collection<String> values = hMap2.values();

        Iterator<String> iter = values.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Object[] array = values.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Map의 내부클래스인 EntrySet을 이용 : entrySet()
        Set<Map.Entry<String, String>> entries = hMap2.entrySet();

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String, Object> hMap3 = new HashMap();
        hMap3.put("book", new BookDTO());
        hMap3.put("person", new PersonDTO());

        ArrayList<BookDTO> bList = new ArrayList<>();
        hMap3.put("bList", bList);
        ArrayList<PersonDTO> pList = new ArrayList<>();
        hMap3.put("pList", pList);

        // 동등객체를 동일객체로 변경해줬는데 null이 나온다?!?!?
        System.out.println(hMap3.get("book"));
        System.out.println(hMap3.get("person"));




    }

}
