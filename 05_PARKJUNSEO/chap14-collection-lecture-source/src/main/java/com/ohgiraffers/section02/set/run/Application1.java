package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Application1 {

    public static void main(String[] args) {

        HashSet<String> hset = new HashSet();
        hset.add(new String("first"));
        hset.add(new String("mysqlDB"));
        hset.add(new String("servlet"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        // Set에 저장된 자료는 넣는 순서를 보장할 수 없다. (다르다.)
        System.out.println("hset : " + hset);  // 출력할 때는 내부적으로 나름 정렬해서 보여주지만, 실제로 순서는 없음


        hset.add("html");
        System.out.println("hset : " + hset);  // 중복값을 안 넣기 때문에 더 이상 html을 넣지 않음. 동등객체를 동일객체로
                                               // 바꾼다는 걸 알 수 있음 (주소값이 같으면 중복으로 인식)

        // Set은 인덱스 개념이 없어서 iterator(반복자)를 활용해야 한다.
        Iterator <String> iter = hset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Object[] array = hset.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println((String)array[i]);   // 그렇게 권장되는 방법은 아님
        }

        System.out.println("size : " + hset.size());
        System.out.println("포함 확인 : " + hset.contains("java"));

        hset.clear();
        System.out.println("size : " + hset.size());
        System.out.println("isEmpty : " + hset.isEmpty());



    }
}
