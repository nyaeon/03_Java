package com.ohgiraffers.section02.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {
        /*
         * LinkedHashSet은 저장 당시의 순서를 유지하는 특성을 가지고 있다.
         * (중복제거 + 순서유지)
         * */
        Set<String> lSet = new LinkedHashSet<>();

        lSet.add("pork");
        lSet.add("ramen");
        lSet.add("kinchi");
        lSet.add("friedEgg");
        lSet.add("chicken");
        lSet.add("chicken");
        lSet.add("chicken");
        System.out.println("lset : " + lSet);

        Iterator<String> iterator = lSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
