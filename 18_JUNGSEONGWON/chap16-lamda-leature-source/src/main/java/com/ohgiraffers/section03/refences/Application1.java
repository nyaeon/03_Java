package com.ohgiraffers.section03.refences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {

    public static void main(String[] args){


        /*
          [메소드 참조 표현식]
        * 클래스 이름::메소드 이름
        * 참조변수이름::메소드이름
        */

        BiFunction<String, String, Boolean> bf = (str1, str2) -> str1.equals(str2);
        System.out.println(bf.apply("java", "java"));
        System.out.println("============================");
        BiFunction<String, String, Boolean> biFunction = String :: equals;
        System.out.println(bf.apply("java", "java"));
        System.out.println("============================");
        Consumer<Object> objectConsumer = System.out::println;
        objectConsumer.accept("나오니");
        System.out.println("============================");
        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("javascript");

        forEach(subjects, System.out::println);

        System.out.println("======================");
        subjects.forEach(System.out::println);
        System.out.println("======================");
        for(String str : subjects){
            System.out.println(str);
        }
    }

    private static void forEach(List<? extends Object> list, Consumer<Object> consumer) {
        for (Object object : list) {
            consumer.accept(object);
        }
    }


}
