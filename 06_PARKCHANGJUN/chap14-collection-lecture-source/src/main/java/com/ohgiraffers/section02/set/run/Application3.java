package com.ohgiraffers.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {

    public static void main(String[] args) {

        TreeSet<String> lset = new TreeSet<>();
        Set<String> tset = new TreeSet<>();

        tset.add("java");
        tset.add("Mysql");
        tset.add("Jdbc");
        tset.add("Html");
        tset.add("Css");

        System.out.println("tset.size : " + tset.size());
        System.out.println("tset : " + tset);

        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("lotto.size : " + lotto.size());
        System.out.println("lotto : " + lotto);

        // 1. 배열로 바꿔서
        Object[] array = lset.toArray();
        for (Object o : array) {
            System.out.println((String)o);
        }
        // 2. 목록만들어서 하나씩 출력

    }
}
