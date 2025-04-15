package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {

    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<>();
        hset.add(new String("java")); // "java" : 키값
        hset.add(new String("mysqlDB"));
        hset.add(new String("servlet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        // Set에 저장된 자료는 넣는 순서를 보장할 수 없다.(다르다.)
        System.out.println("hset : " + hset);
//        hset.add("java"); // 동등객체를 동일객체를 바꿔준다라는 의미와 같음.
        // set은 하나라도 같은 값이 있으면 추가해주지 않고 다른값이 있으면 추가해 준다.
        hset.add(new String("java"));
        hset.add(new String("mysqlDB"));
        System.out.println("hset : " + hset);

        // Set은 인덱스 개념이 없어서 iterator(반복자)를 활용해야한다.
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        Object[] array = hset.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println((String) array[i]);
        }

        System.out.println("size : " + hset.size());
        System.out.println("포함 확인 : " + hset.contains("java1"));

        hset.clear();

        System.out.println("size : " + hset.size());
        System.out.println("isEmpty : " + hset.isEmpty());
    }
}
