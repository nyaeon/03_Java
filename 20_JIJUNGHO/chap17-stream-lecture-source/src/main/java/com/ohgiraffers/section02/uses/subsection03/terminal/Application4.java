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

        List<String> stringList = Arrays.asList("java", "Spring", "Springboot");
        boolean anyMatch = stringList.stream()
                .anyMatch(str -> str.contains("p"));
        System.out.println("anyMatch = " + anyMatch); // true
        
        boolean allMatch = stringList.stream()
                .allMatch(str -> str.length() > 4);
        System.out.println("allMatch = " + allMatch); // false

        boolean noneMatch = stringList.stream()
                .noneMatch(str -> str.contains("z"));
        System.out.println("nonMatch = " + noneMatch); // true

    }
}
