package com.ohgiraffers.section03.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {

    public static void main(String[] args) {

        /*
         * [메소드 참조 표현식]
         * 클래스 이름 :: 메소드 이름
         * 참조 변수 이름 :: 메소드 이름
         */

        //BiFunction<String, String, Boolean> 여기서 boolean으로 리턴한다는 뜻.
        BiFunction<String, String, Boolean> bf = (str1, str2) -> str1.equals(str2);
        System.out.println(bf.apply("java", "java")); // 두 개 비교해 true

        BiFunction<String, String, Boolean> biFunction = String::equals; // 왼쪽 매개변수 타입 두개와 같음. 동일함. 축약한 거임
        System.out.println(biFunction.apply("java", "java"));

        Consumer<Object> objectConsumer = (str) -> System.out.println("hello");
        Consumer<Object> objectConsumer1 = System.out::println;
        objectConsumer1.accept("hello");

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("javascript");

        forEach(subjects, System.out::println);

        System.out.println("======================");
        subjects.forEach(System.out::println);//subjects에 담겨져 있는 내용 consumer에 출력하라는 뜻
        System.out.println("======================");
        for(String str : subjects) {
            System.out.println(str);
        }

    }

    private static void forEach(List<? extends Object> lit, Consumer<Object> consumer) {
        for (Object o : lit) {
            consumer.accept(o);
        }
    }
}
