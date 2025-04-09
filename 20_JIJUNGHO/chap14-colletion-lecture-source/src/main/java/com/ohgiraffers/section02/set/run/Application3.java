package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {

    public static void main(String[] args) {

        /*
        * TreeSet : Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다.
        * (중복제거 + 순서유지(X))
        * */

        TreeSet<String> tset = new TreeSet<>();

        tset.add("Java");
        tset.add("MySqlDB");
        tset.add("Jdbc");
        tset.add("Html");
        tset.add("Css");

        System.out.println(tset.size());
        System.out.println("tset = " + tset);


        // Set, TreeSet을 활용한 복권 추첨기
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            // 1부터 45까지 랜덤한 수를 정렬
            lotto.add(((int) (Math.random() * 45)) + 1);
        }

        System.out.println("lotto : " + lotto);

        // 1. 배열로 바꿔서
        Object[] array = tset.toArray();
        for (Object o : array) {
            System.out.println((String) o);
        }

        // 2. 목록 만들어서 하나씩 출력
        Iterator<Integer> iter = lotto.iterator();
        while (iter.hasNext()) {
            System.out.println("iter : " + iter.next());
        }

    }

}
