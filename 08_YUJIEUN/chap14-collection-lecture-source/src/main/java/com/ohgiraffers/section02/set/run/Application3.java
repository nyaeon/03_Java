package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {

    public static void main(String[] args) {

        TreeSet<String> lSet = new TreeSet<>();
        Set<String> tSet = new TreeSet<>();

        tSet.add("Java");
        tSet.add("MySql");
        tSet.add("Jdbc");
        tSet.add("Html");
        tSet.add("Css");

        System.out.println(tSet.size());
        System.out.println("tSet: " + tSet);

        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }

        System.out.println("lotto: " + lotto);

        // 1. 배열로 바꿔서
        Object[] array = lSet.toArray();
        for (Object obj : array) {
            System.out.println((String) obj);
        }
        // 2. 목록만들어서 하나씩 출력
        Iterator<String> iterator = lSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}