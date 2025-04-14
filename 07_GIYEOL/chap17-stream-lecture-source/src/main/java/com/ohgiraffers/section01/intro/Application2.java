package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application2 {
        public static void main(String[] args) {

            List<String> StringList = new ArrayList<>(Arrays.asList("java","mysql","jdbc","html","css"));

            System.out.println("====================");
            for (String str : StringList) {
                System.out.println(str + " : " + Thread.currentThread().getName());
            }
            System.out.println("=====================");
            StringList.forEach(Application2::print);
            StringList.forEach(Application2::print);
            System.out.println("=====================");
            StringList.parallelStream().forEach(Application2::print);
       //     StringList.parallelStream().forEach(Application2::print);
            System.out.println("=====================");
         //   Stream<String> StringList = StringList.stream();
         //   StringList.forEach(Application2::println);


        }
        private static void print(String str) {
            System.out.println(str + " : " + Thread.currentThread().getName());

        }
}
