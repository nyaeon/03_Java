package com.ohgiraffers.section02.run;

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

        // set에 저장된 자료는 넣는 순서를 보장할 수 없다.
        System.out.println("hset : " + hset);

        hset.add("java");
        hset.add("mysqlDB1");
        System.out.println("hset : " + hset);

        // Set은 인덱스 개념이 없어서 iterator(반복자)를 활용해야한다.
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Object[] array = hset.toArray();
        for(int i = 0; i < array.length; i++) {
            System.out.println((String)array[i]);
        }

        System.out.println("size : " + hset.size());
        System.out.println("포함 확인 : " + hset.contains("java"));

        hset.clear();

        System.out.println("size : " + hset.size());
        System.out.println("isEmpty : " + hset.isEmpty());
    }
}
