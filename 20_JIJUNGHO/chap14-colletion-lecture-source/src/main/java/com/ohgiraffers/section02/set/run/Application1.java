package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {

    public static void main(String[] args) {
        /*
        * set : 비정형구조
        * (중복제거 + 순서유지(X))
        * */
        HashSet<String> hSet = new HashSet<>();

        hSet.add(new String("java"));
        hSet.add(new String("mysqlDB"));
        hSet.add("servlet");
        hSet.add("spring");
        hSet.add(new String("html"));

        // set에 저장된 자료는 저장 순서를 보장할 수 없다. (다르다.)
        System.out.println("hSet = " + hSet);


        // 중복된 값을 추가되지 않음
        hSet.add("java");
        System.out.println("hSet = " + hSet);

        // set은 인덱스 개념이 없어서 iterator(반복자)를 활용해야한다.
        Iterator<String> iter = hSet.iterator();

        while (iter.hasNext()) {
            System.out.println("iter.next() : " + iter.next());
        }

        // 권장하지 않는 방식
        Object[] hSetArray = hSet.toArray();
        for (int i = 0; i < hSetArray.length; i++) {
            System.out.println("hSetArray : " + hSetArray[i]);
        }

        // 요소의 개수 조회
        System.out.println("hSet.size() : " + hSet.size());

        // contains() : contains으로 해당 값을 포함하고 있는지 확인
        System.out.println("포함 확인 : " + hSet.contains("java"));

        hSet.clear();
        System.out.println("hSet.size() : " + hSet.size());
        System.out.println("isEmpty() : " + hSet.isEmpty());

    }

}
