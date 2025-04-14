package com.ohgiraffers.homework.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndJoinString {
    public static void main(String[] args) {
        List<String> words = List.of("hi","hello","to","world","java");
        String result = words.stream()
                .filter(word -> word.length() >= 3)
                .collect(Collectors.joining(",","[","]"));
                System.out.println(result);
   //  words.forEach(wd -> {
   //          if(wd.length()>=3){
   //              System.out.println(wd);
   //  }
   //  });
    }
}
