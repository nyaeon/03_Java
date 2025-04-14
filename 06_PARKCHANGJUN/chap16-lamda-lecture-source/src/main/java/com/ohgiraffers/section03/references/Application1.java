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
         */

        BiFunction<String, String, Boolean> bf = (str1, str2) -> str1.equals(str2);
        System.out.println(bf.apply("java", "java"));

        // 매개변수 String 2개 선언, 리턴 값 Boolean 선언
        BiFunction<String, String, Boolean> biFunction = String::equals;
        System.out.println(biFunction.apply("java", "java"));

        // 원래 이런 방법을 사용했지만 여기서는 다른방식으로 사용 가능
//        Consumer<Object> objectConsumer = (str) -> System.out.println("hello");
        Consumer<String> objectConsumer = System.out::println;
        objectConsumer.accept("나오니?");

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("javascript");

        forEach(subjects, System.out::println);

        System.out.println("=====================================");
        subjects.forEach(System.out::println);

        System.out.println("=====================================");
        for (String str : subjects) {
            System.out.println(str);
        }
    }

    private static void forEach(List<? extends Object> lit, Consumer <Object> consumer) {
        for (Object o : lit) {
            consumer.accept(o);
        }
    }


}
