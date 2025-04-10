package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {

    public static void main(String[] args) {

        /*
        * LinkedHashSet은 저장 당시의 순서를 유지하는 특성을 가지고 있다.
        * (중복제거 + 순서유지)
        * */

        Set<String> lset = new LinkedHashSet<>();

        lset.add("ramen");
        lset.add("pork");
        lset.add("kimchi");
        lset.add("friedEgg");
        lset.add("chiken");

        System.out.println("lset = " + lset);

        Iterator<String> iter = lset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        
    }
}
