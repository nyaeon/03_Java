package com.ohgiraffers.section02.uses.subsection03.terminal;

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

        List<String> stringList = Arrays.asList("홍창기", "박동원", "오스틴", "김현수", "김범석", "김용의");

        boolean anyMatch =  stringList.stream().anyMatch(str -> str.contains("김"));
        boolean allMatch = stringList.stream().allMatch(str -> str.length() > 2);
        boolean noneMatch = stringList.stream().noneMatch(str -> str.contains("엽"));
        System.out.println("anyMatch = " + anyMatch);
        System.out.println("allMatch = " + allMatch);
        System.out.println("noneMatch = " + noneMatch);
    }
}
