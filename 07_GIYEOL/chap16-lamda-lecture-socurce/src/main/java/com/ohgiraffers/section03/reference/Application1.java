package com.ohgiraffers.section03.reference;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {
    public static void main(String[] args) {
        /***
         * [메소드 참조 표현식]
         * 클래스 이름 :: 메소드이름
         * 참조변수 이름 :: 메소드 이름
         *
         */
        BiFunction<String, String, Boolean> bf = (str1, str2) -> str1.equals(str2);
        System.out.println(bf.apply("java", "java"));

        BiFunction<String, String, Boolean> bf2 = String::equals;
        System.out.println(bf2.apply("java", "java"));

        Consumer<Object> objectsConsumer = System.out::println;
        objectsConsumer.accept("나옴?");

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("hmtl");
        subjects.add("Jabascript");

     //   forEach(subjects , System.out::println);
        System.out.println("=================================");
        subjects.forEach(System.out::println);

        System.out.println("=================================");
        for(String str : subjects) {
            System.out.println(str);
        }


    }
        private static void forEach(List<? extends Objects> lit ,Consumer<Objects> consumer){
            for (Objects o : lit){
                consumer.accept(o);
            }
        }
    }


