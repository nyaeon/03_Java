package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("hello", "world", "stream"));
        for (String string : stringList) {
            System.out.println(string);
        }
    }
}
