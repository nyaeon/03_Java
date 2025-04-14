package com.ohgiraffers.homework.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PeekCharactor {
    public static void main(String[] args) {
        List<String> texts = Arrays.asList("I love Java",null,"java is fun","Python",null);
        texts.stream()
                .filter(Objects::nonNull)
                .filter(str -> str.toLowerCase().contains("java"))
                .map(String::toLowerCase) //소문자로 변환 해주는 변수 toLowerCase
                .forEach(System.out::println);
      //  texts.forEach(t -> {if(t.isEmpty()) System.out.println(t);});
      //  //        System.out.println(Objects::null)
      //  System.out.println(Objects::nonNull);
    }
}

