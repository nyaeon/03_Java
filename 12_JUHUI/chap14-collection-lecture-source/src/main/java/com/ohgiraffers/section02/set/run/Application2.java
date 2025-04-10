package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application2 {

    public static void main(String[] args) {

        /*
         * LinkedHashSet은 저장 당시의 순서를 유지하는 특성을 가지고 있다.
         * (중복 제거 + 순서 유지)
         */
        Set<String> lset = new HashSet<String>();
        lset.add("ramen");
        lset.add("pork");
        lset.add("kimch");
        lset.add("friedEgg");
        lset.add("chicken");


        System.out.println("lset: " + lset);

        Iterator<String> iterator = lset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
