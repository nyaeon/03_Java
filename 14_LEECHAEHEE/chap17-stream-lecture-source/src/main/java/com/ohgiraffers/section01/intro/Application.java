package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("hello", "world", "scream"));
        System.out.println("======================= foreach");
        for (String string : stringList) {
            System.out.println(string);
        }

        System.out.println("======================= foreach");
        stringList.forEach(System.out::println);
    }
}
