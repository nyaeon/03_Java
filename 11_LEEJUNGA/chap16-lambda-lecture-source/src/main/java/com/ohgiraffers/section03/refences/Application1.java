package com.ohgiraffers.section03.refences;

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
        System.out.println(bf.apply("java", "java"));

        BiFunction<String, String, Boolean> biFunction = String::equals;
        System.out.println(biFunction.apply("java", "java"));

        Consumer<Object> objectConsumer = System.out::println;
        objectConsumer.accept("java");

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("javascript");

        forEach(subjects, System.out::println);

        System.out.println("========================================");

        subjects.forEach(System.out::println);
    }

    private static void forEach(List<?> lit, Consumer<Object> consumer) {
        System.out.println("========================================");
        for(Object o : lit) {
            consumer.accept(o);
        }
    }
}
