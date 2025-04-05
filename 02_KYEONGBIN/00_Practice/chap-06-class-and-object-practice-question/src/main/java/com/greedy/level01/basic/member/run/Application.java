package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        MemberDTO member = new MemberDTO();

        // Print
        System.out.println("ID: " + member.getId());
        System.out.println("PWD: " + member.getPwd());
        System.out.println("NAME: " + member.getName());
        System.out.println("AGE: " + member.getAge());
        System.out.println("GENDER: " + member.getGender());
        System.out.println("PHONE: " + member.getPhone());
        System.out.println("EMAIL: " + member.getEmail());

        // Enter info

        member.setId("user01");
        member.setPwd("pass01");
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('M');
        member.setPhone("010-1234-5678");
        member.setEmail("hong123@greedy.com");

        // Print
        System.out.println("ID: " + member.getId());
        System.out.println("PWD: " + member.getPwd());
        System.out.println("NAME: " + member.getName());
        System.out.println("AGE: " + member.getAge());
        System.out.println("GENDER: " + member.getGender());
        System.out.println("PHONE: " + member.getPhone());
        System.out.println("EMAIL: " + member.getEmail());




    }

}
