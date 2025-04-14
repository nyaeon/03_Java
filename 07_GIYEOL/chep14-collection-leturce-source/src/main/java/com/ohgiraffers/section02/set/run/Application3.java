package com.ohgiraffers.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        TreeSet<String> lset = new TreeSet<>();
        Set<String> tset = new TreeSet<>();

        tset.add("java");
        tset.add("mysql");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        System.out.println(tset.size());
        System.out.println("tset : " + tset);

        Set<Integer> lotto = new TreeSet<>();
        while (lotto.size() < 6){
            lotto.add((int)(Math.random()*45)+1);
        }
        System.out.println(lotto);
        //1. 배열로 바꿔서
        //2. 목록을 만들어서 하나씩 출력
  //      Object[] array = lset.toArray();
  //      for (Object i = 0; i < array.length; i++) {
  //          System.out.println((String)i);
    }
}

