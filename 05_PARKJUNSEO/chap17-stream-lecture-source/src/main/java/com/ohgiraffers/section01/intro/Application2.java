package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("java", "mysql", "jdbc", "html", "css"));

        System.out.println("========================== foreach");
        for(String str : stringList) {
            // Thread: 이 동작의 시작을 누가 잡고 있는가 // main
            System.out.println(str + " : " + Thread.currentThread().getName());
        }

        System.out.println("========================== foreach"); // 일반 for문이기 때문에 위에 있는 것 끝나고 동작 (직렬)
        for(String str : stringList) {
            // Thread: 이 동작의 시작을 누가 잡고 있는가 // main
            System.out.println(str + " : " + Thread.currentThread().getName());
        }
// ========================================================================================

        System.out.println("========================== normal stream ==========================");
        stringList.forEach(Application2::print);
        stringList.forEach(Application2::print);
        System.out.println("========= 여기까지는 직렬 처리. 이제부터는 병렬 처리 =========");
        System.out.println("========================== parallel stream ==========================");
        stringList.parallelStream().forEach(Application2::print);  // 얘는 먼저 도달하는 애들이 먼저 출력함
        stringList.parallelStream().forEach(Application2::print);

        System.out.println("=====================================================================");
        Stream<String> stringStream = stringList.stream();
        stringStream.forEach(Application2::print);


    }





    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }




}
