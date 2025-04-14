package com.ohgiraffers.section02.user.section01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        String[] sarr = new String[]{"java","mysql","jdbc"};
        for (String s : sarr) {
            System.out.println(s);
        }

        System.out.println("=======================");
        Stream<String> strstream1 = Arrays.stream(sarr);
        strstream1.forEach(System.out::println);

        System.out.println("=======================");
        Stream<String> strstream2 = Arrays.stream(sarr,0,2);
        strstream2.forEach(System.out::println);
        System.out.println("=======================");

        List<String> strlist = Arrays.asList("html","css","js");

        Stream<String> strstream3 = strlist.stream();
        strlist.forEach(System.out::println);
        System.out.println("=======================");
        strlist.forEach(System.out::println);//컬랙션의 경우 스트림 생성을 생략하고 사용할 수 있다


        Stream<String> builderStream = Stream.<String>builder()
                .add("홍기롣")
                .add("유관순")
                .add("윤봉길").build();
        builderStream.forEach(System.out::println);

        Stream<Integer> intstream = Stream.iterate(10,value -> value *2).limit(10);
        intstream.forEach(value -> System.out.print(value+" "));

    }
}
