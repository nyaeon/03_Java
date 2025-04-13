package com.ohgiraffers.section01.intro;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("java", "mysql", "jdbc", "html", "css"));

        System.out.println("==================== foreach");
        for(String str : stringList) {
            System.out.println(str + " : " + Thread.currentThread().getName());
            // Thread 동작의 시작을 누가 잡고있냐라는 뜻. 여기서 메인이라는 메소드가 동작의 시작을 의미
            // 여기서 동작의 시작을 메인이 잡고 있음.
            // 결과 : 메인이라는 곳에서 파생되었다고 나옴.
        }
        for(String str : stringList) {
            System.out.println(str + " : " + Thread.currentThread().getName());
        }

        System.out.println("==================== normal stream");
        stringList.forEach(Application2::print);
        stringList.forEach(Application2::print);
        System.out.println("==================== paralle stream");
        stringList.parallelStream().forEach(Application2::print);
        // 메인 스레드 말고 다른 스레드를 열어서 병열로 처리하는 방법(parallelStream)

        System.out.println("===========================================");
        Stream<String> stringStream = stringList.stream();
        stringStream.forEach(Application2::print);
    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
