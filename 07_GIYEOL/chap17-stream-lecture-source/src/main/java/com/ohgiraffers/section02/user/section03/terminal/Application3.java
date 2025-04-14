package com.ohgiraffers.section02.user.section03.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        /***
         * collect()는 Collector타입을 받아서 처리함, 해당 메소드를 통해 컬렉션을 출력으로 받을 수 있다
         * collect() 메소드는 collector객체에서 제공하는 정적 메소드를 사용할 수 있다
         */
        List<Member> memberlist = Arrays.asList(
                new Member("test01", "testname01"),
                new Member("test02", "testname02"),
                new Member("test03", "testname03")
        );
        System.out.println(memberlist);

        //name값만 따로 list로 만들기
   //    List<String> stringlist = new ArrayList<>();
   //    for (Member member : memberlist) {
   //        stringlist.add(member.getName());
   //    }
   //    System.out.println("stringlist : " + stringlist);
        List<String> collector = memberlist.stream().map(Member::getName).collect(Collectors.toList());
        System.out.println("collector : " + collector);

        String str = memberlist.stream().map(Member::getName).collect(Collectors.joining());
        System.out.println("str : " + str);

        String str2 = memberlist.stream().map(Member::getName).collect(Collectors.joining(",",":) ","!"));
        System.out.println("str2 : " + str2);


    }
}