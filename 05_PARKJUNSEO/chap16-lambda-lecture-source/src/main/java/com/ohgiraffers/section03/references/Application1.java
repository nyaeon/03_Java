package com.ohgiraffers.section03.references;

import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {
    public static void main(String[] args) {

        /*
        * [메소드 참조 표현식]
        * 클래스 이름::메소드 이름
        * 참조변수 이름::메소드 이름
        * */

        BiFunction<String, String, Boolean> bf = (str1, str2) -> str1.equals(str2);
        System.out.println(bf.apply("java", "java"));

        BiFunction<String, String, Boolean> bifunction = String::equals; // 이런식의 표현이 가능함
        System.out.println(bifunction.apply("java", "java"));

        Consumer<Object> objectConsumer = System.out::println;
        objectConsumer.accept("출력 확인용 메시지");

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("javascript");
        subjects.add("python");
        subjects.add("c++");
        subjects.add("c");

        forEach(subjects, System.out::println);

        System.out.println("=================================");
        subjects.forEach(System.out::println);

        System.out.println("=================================");
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