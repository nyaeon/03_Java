package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {

    public static void main(String[] args) {

        /*
        * LinkedHashSet은 저장 당시의 순서를 유지하는 특성을 가지고 있다.
        * (중복제거 + 순서유지)
         */
        Set<String> lSet = new LinkedHashSet<>();

        lSet.add("ramen");
        lSet.add("pork");
        lSet.add("kimchi");
        lSet.add("friedEgg");
        lSet.add("chicken");
//        lSet.add("chicken");
//        lSet.add("chicken");

        System.out.println("lSet = " + lSet);

        lSet.iterator();
    }
}
