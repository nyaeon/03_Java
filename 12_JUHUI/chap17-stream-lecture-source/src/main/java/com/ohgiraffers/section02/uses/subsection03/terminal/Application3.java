package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {

    public static void main(String[] args) {
        /*
         * collect()는 Collector 타입을 받아서 처리하는데, 해당 메소드를 통해 컬렉션을 출력으로 받을 수 있다.
         * collect() 메소드는 Collector 객체에서 제공하는 정적 메소드를 사용할 수 있다.
         */

        List<Member> memberList = Arrays.asList(
                new Member("test01", "testName01"),
                new Member("test02","testName02"),
                new Member("test03","testName03")
        );
        System.out.println("memberList: " + memberList);

        // name값만 따로 list로 만들어줄래???
//        List<String> stringList = new ArrayList<>();
//
//        for (Member member : memberList) {
//            stringList.add(member.getName());
//        }
//
//        System.out.println("stringList: " + stringList);

        // 이걸 컬렉트로 할 건데
        List<String> collecterCollection = memberList.stream()
                .map(Member::getName).collect(Collectors.toList()); // 리스트 형식으로 뽑아줘

        System.out.println("collecterCollection: " + collecterCollection);

        String str = memberList.stream().map(Member::getName).collect(Collectors.joining());
        //joining() : 있는 그래도 그냥 합침. 근데 구분을 할 수 있음.
        System.out.println("str: " + str);

        String str2 = memberList.stream().map(Member::getName).collect(Collectors.joining(",","2","!"));
        System.out.println("str2: " + str2);// joining()에 구분자 넣어 보기 편해짐. delimiter가 구분자를 뭘 입력할 건지 말함


    }
}
