package com.ohgiraffers.section02.set.run;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("tSet : " + tSet);

        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }

        System.out.println("lotto : " + lotto);

        // 1. 배열로 바꿔서
        Object[] array = tSet.toArray();
        for (Object o : array) {
            System.out.println((String) o);
        }

        // 2. 목록 만들어서 하나씩 출력
        List<String> list = new ArrayList<>(tSet);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
