package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.Math.random;

public class Application3 {

    public static void main(String[] args) {

        // 더 업그레이드 : 중복 제거 + 순서 없음 + 매우 빠른 기본 동작 시간

        TreeSet<String> tSet = new TreeSet<>();
        Set<String> tSet2 = new TreeSet<>();   // 둘 다 똑같이 사용 가능함

        tSet2.add("kimchi");
        tSet2.add("chicken");
        tSet2.add("pizza");
        tSet2.add("rice");
        tSet2.add("ramen");
        tSet.add("kimchi");

        System.out.println("tSet.size() = " + tSet.size());
        System.out.println("tSet2 = " + tSet2);

        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45 + 1));
        }

        System.out.println("lotto = " + lotto);


         // 1. 배열로 바꿔서
         Object[] array = tSet.toArray();
         for (Object o : array) {
             System.out.println((String) o );
         }

         // 2. 목록 만들어서 하나씩 출력
        Iterator<String> iterator = tSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
