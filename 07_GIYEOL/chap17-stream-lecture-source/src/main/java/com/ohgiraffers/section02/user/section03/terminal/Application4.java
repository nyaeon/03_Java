package com.ohgiraffers.section02.user.section03.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /*
         * match
         * boolean anyMatch(Predicate<? super T> predicate);      // 하나라도 조건을 만족하는 값이 있는지
         * boolean allMatch(Predicate<? super T> predicate);      // 모든 조건을 만족하는지
         * boolean noneMatch(Predicate<? super T> predicate);     // 모든 조건을 만족하지 않는지
         * */
        List<String> stringlist = Arrays.asList("java","spring","springboot");
        boolean anymatch = stringlist.stream().anyMatch(str -> str.contains("p"));
        boolean allmatch = stringlist.stream().allMatch(str -> str.length()>4);
        boolean nonematch = stringlist.stream().noneMatch(str -> str.contains("z"));

        System.out.println("anymatch : " + anymatch);
        System.out.println("allmatch : " + allmatch);
        System.out.println("nonematch : " + nonematch);



    }
}
