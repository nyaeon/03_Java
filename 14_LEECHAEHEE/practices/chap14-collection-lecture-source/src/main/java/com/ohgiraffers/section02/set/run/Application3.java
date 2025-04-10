package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
//        Set<String> hset = new TreeSet<>();
    tSet.add("Java");
    tSet.add("Mysql");
    tSet.add("Jdbc");
    tSet.add("Html");
    tSet.add("CSS");
    System.out.println("tSet.size() = " + tSet.size());
    System.out.println("tSet = " + tSet);

    Set<Integer> lotto = new LinkedHashSet<>();
    while (lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
    }
    System.out.println("lotto = " + lotto);
    // 1. 배열로 바꿔서

    // 2. 목록 만들어서 하나씩 출력


    }
}
