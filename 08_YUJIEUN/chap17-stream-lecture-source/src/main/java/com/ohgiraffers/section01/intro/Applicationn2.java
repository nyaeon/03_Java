package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Applicationn2 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("java","mysql","jdbc","html","css"));

        System.out.println("================ foreach");
        for (String str : stringList) {
            System.out.println(str + " : " + Thread.currentThread().getName());
        }

        for (String str : stringList) {
            System.out.println(str + " : " + Thread.currentThread().getName());
        }

        System.out.println("================ normal Stream");
        stringList.forEach(Applicationn2::print);
//        stringList.forEach(Applicationn2::print);
        System.out.println("================ parallel Stream");
        stringList.parallelStream().forEach(Applicationn2::print);
//        stringList.parallelStream().forEach(Applicationn2::print);


        System.out.println("=============================");
        Stream<String> stringStream =stringList.stream();
//        stringList.forEach(Applicationn2::print);



    }

    private static void print (String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }



}
