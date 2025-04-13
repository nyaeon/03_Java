package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {

        // 생성자 들어가기 : 커맨드 마우스 왼쪽
        List<String> streingList = new ArrayList<>(Arrays.asList("hello", "world", "stream"));

        System.out.println("================== foreach");
        for (String s : streingList) {
            System.out.println(s);
        }

        System.out.println("================== stream");
        streingList.forEach(System.out::println);

    }
}
