package com.ohgiraffers.section01.intro;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {
        List<String> StringList = new ArrayList<>(Arrays.asList("heool"));
        System.out.println();
        for(String s : StringList){
            System.out.println(s);
        }
        System.out.println();
        StringList.forEach(System.out::println);
    }
}
