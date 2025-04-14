package com.ohgiraffers.section03.refences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {

    public static void main(String[] args) {

        /**
         * 메소드 참조 표현식
         * = 함수형 인터페이스를 람다식이 아닌 일반 메소드를 참조시켜 선언하는 방법
         * 1. 클래스이름::메소드이름
         * 2. 참조변수이름::메소드이름
         */

        // 람다식 표현
        BiFunction<String, String, Boolean> bf = (str1, str2) -> str1.equals(str2);
        System.out.println(bf.apply("java", "java"));

        // 메소드 참조식으로 표현
        BiFunction<String, String, Boolean> bf2 = String::equals;
        System.out.println(bf2.apply("java", "java"));

        Consumer<Object> cs = System.out::println;
        cs.accept("javaScript");

        List<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("mySql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("javaScript");

        forEach(subjects, System.out::println);

        System.out.println("=========================================");
        subjects.forEach(System.out::println);

        System.out.println("=========================================");
        for (String str : subjects) {
            System.out.println(str);
        }
    }

    private static void forEach(List<? extends Object> list, Consumer<Object> cs) {
        for (Object o : list) {
            cs.accept(o);
        }
    }


}
