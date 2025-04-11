package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("java", "mysql", "jdbc", "html", "css"));

        System.out.println("============ foreach");
        for(String str : stringList) {
            System.out.println(str+ " : " + Thread.currentThread().getName());//스레드가 동작의 시작을 누가 잡고 있느냐. 여기서는 main. 메인에서부터 처리하고 있다는 말임.
        }

        for(String str : stringList) {
            System.out.println(str + " : " + Thread.currentThread().getName());
        }

        System.out.println("============ normal stream");
        stringList.forEach(Application2::print);
        stringList.forEach(Application2::print);
        System.out.println("============ parallel stream");
        // main말고 다른 스레드를 열어서 병렬로 출력한다는 뜻.
        stringList.parallelStream().forEach(Application2::print);
        //stringList.parallelStream().forEach(Application2::print);

        System.out.println("===========================");
        //Stream<String>
    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
