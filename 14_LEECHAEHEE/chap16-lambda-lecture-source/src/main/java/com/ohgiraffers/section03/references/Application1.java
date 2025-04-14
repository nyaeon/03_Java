package com.ohgiraffers.section03.references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {
    public static void main(String[] args) {

        /*
        * [메소드 참조 표현식]
        * 클래스이름::메소드이름
        * 참조변수이름::메소드이름
        * */

        BiFunction<String, String, Boolean> bf = (str1, str2) -> str1.equals(str2);
        System.out.println(bf.apply("123", "123"));

        BiFunction<String, String, Boolean> bf2 = String::equals;
        System.out.println(bf2.apply("123", "123"));

        Consumer<Object> objectConsumer = System.out::println;
        objectConsumer.accept("123");

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("javaScript");

        ForEach(subjects, System.out::println);

        System.out.println("=================================");
        subjects.forEach(System.out::println);
        System.out.println("=================================");

    }

    private static void ForEach(List<? extends Object> lit, Consumer<Object> consumer) {
        for (Object o : lit) {
            consumer.accept(o);
        }
    }
}
