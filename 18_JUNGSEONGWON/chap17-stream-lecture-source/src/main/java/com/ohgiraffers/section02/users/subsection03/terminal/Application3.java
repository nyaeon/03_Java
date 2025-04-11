package com.ohgiraffers.section02.users.subsection03.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {

    /*
    * collect()는 Collector 타입을 받아서 처리하는데, 해당 메소드를 통해 컬렉션을 출력으로 받을 수 있다.
    * collect() 메소드는 Collector 객체에서 제공하는 정적 메소드를 사용 할 수 있다.
    * */
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
            new Member("testName01","test01"),
            new Member("testName02","test02"),
            new Member("testName03","test03")
        );
        System.out.println("memberList = " + memberList);
        
        // name값만 따로 list로 만들어줄래? 실허~
//        List<String> stringList = new ArrayList<>();
//        
//        for (Member member : memberList) {
//            stringList.add(member.getName());
//        }
//        System.out.println("stringList = " + stringList);
        System.out.println("====================================");
        List<String> collectorCollection = memberList.stream()
                                                     .map(Member::getName)
                                                     .collect(Collectors.toList());
        System.out.println("collectorCollection = " + collectorCollection);
        System.out.println("====================================");
        String str = memberList.stream().map(Member::getName).collect(Collectors.joining());
        System.out.println("str = " + str);
        System.out.println("====================================");
        String str2 = memberList.stream().map(Member::getName).collect(Collectors.joining(",","|브이|","|당근|"));
        System.out.println("str2 = " + str2);
    }
}
