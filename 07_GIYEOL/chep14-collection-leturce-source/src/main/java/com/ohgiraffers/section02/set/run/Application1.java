package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<>();
        hset.add(new String("java"));
        hset.add(new String("mysqlDB"));
        hset.add(new String("servlet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        //set 에 저장된 자료는 넣는 순서를 보장할 수 없다 (다름)
        System.out.println("hset: " + hset);

        hset.add("java");
        System.out.println("hset: " + hset);

        //set은 인덱스 개념이 없어 iterator(반복자)를 활용해야 함
        Iterator<String> iterator = hset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Object[] array = hset.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("size: " + hset.size());
        System.out.println("포함확인 : " + hset.contains("java"));
        System.out.println("포함확인 : " + hset.contains("java1"));

        hset.clear();
        System.out.println("size: " + hset.size());
        System.out.println("isEmpty" + hset.isEmpty());


        //     hset.remove("java");
 //     System.out.println("hset: " + hset);
    }
}
