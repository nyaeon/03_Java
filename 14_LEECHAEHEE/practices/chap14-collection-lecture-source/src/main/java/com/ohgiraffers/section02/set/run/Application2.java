package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {
        /*
        * LinkedHashset은 저장 당시의 순서르 유지하는 특성을 가지고 있다.
        * (중복제거 + 순서유지)
        * */
        Set<String> lset = new LinkedHashSet<>();
        lset.add("pork");
        lset.add("ramen");
        lset.add("kimchi");
        lset.add("friedegg");
        lset.add("chicken");
        // lset.add("chicken");
        System.out.println("lset = " + lset);

      Iterator<String> iter = lset.iterator();
      while (iter.hasNext()) {
          System.out.println(iter.next());
      }
    }
}
