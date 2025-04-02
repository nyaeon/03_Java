package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {

        // 기본 생성자를 이용해서 객체를 생성

        MemberDTO member = new MemberDTO();     // JVM이 기본값을 넣어줌

        member.getId();
        member.getPwd();
        member.getName();
        member.getAge();
        member.getGender();
        member.getPhone();
        member.getEmail();

        member.setId("user01");
        member.setPwd("pass01");
        member.setName("홍길동");
        member.setAge(20);
        member.setGender("M");
        member.setPhone("010-1234-5678");
        member.setEmail("hong123@greedy.com");

        System.out.print("변경 후 ");
        member.getId();
        System.out.print("변경 후 ");
        member.getPwd();
        System.out.print("변경 후 ");
        member.getName();
        System.out.print("변경 후 ");
        member.getAge();
        System.out.print("변경 후 ");
        member.getGender();
        System.out.print("변경 후 ");
        member.getPhone();
        System.out.print("변경 후 ");
        member.getEmail();





    }
}
