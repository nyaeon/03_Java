package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {

    public static void main(String[] args){
        List<String> stringList = new ArrayList<>(Arrays.asList("Hello", "World","Stream"));

        System.out.println("========== ForEach");
        for(String s : stringList){
            System.out.println(s);
        }
        System.out.println("==========  Stream");
        stringList.forEach(System.out::println);
    }
}
