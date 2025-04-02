package com.greedy.level01.basic.member.model.dto;

import java.lang.reflect.Member;

public class Application {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO();
        System.out.println("id = " + member.getId());
        member.setId("user01");
        System.out.println("pwd = " + member.getPwd());
        member.setPwd("pass01");
        System.out.println("age = " + member.getAge());
        member.setAge(20);
        System.out.println("gender = " + member.getGender());
        member.setGender('M');
        System.out.println("name = " + member.getName());
        member.setName("홍길동");
        System.out.println("phone = " + member.getPhone());
        member.setPhone("010-1234-1234");
        System.out.println("email = " + member.getEmail());
        member.setEmail("hong123@greedy.com");
        System.out.println("");
        System.out.println("");
        System.out.println("id = " + member.getId());
        System.out.println("pwd = " + member.getPwd());
        System.out.println("age = " + member.getAge());
        System.out.println("gender = " + member.getGender());
        System.out.println("name = " + member.getName());
        System.out.println("phone = " + member.getPhone());
        System.out.println("email = " + member.getEmail());
    }
}
