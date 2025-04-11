package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "mysql", "jdbc", "html", "css"));

        System.out.println(" ============================== foreach");
        for (String str : stringList) {
            System.out.println(str + " : " + Thread.currentThread().getName());
        }

        for (String str : stringList) {
            System.out.println(str + " : " + Thread.currentThread().getName());
        }

        System.out.println(" ============================== normal stream");
        stringList.forEach(Application2::print);
        stringList.forEach(Application2::print);
        System.out.println(" ============================== parallel stream");
        stringList.parallelStream().forEach(Application2::print);
//        stringList.parallelStream().forEach(Ap plication2::print);

        System.out.println("=======================");
        Stream<String> stream = stringList.stream();
        stream.forEach(Application2::print);
    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
