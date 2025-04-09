package com.com.greedy.level01.basic.member.run;

import com.com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {
        MemberDTO memberDTO = new MemberDTO();

        System.out.println(memberDTO);

        memberDTO.setId("user01");
        memberDTO.setPwd("pass01");
        memberDTO.setName("홍길동");
        memberDTO.setAge(20);
        memberDTO.setGender('M');
        memberDTO.setPhone("010-1234-5678");
        memberDTO.setEmail("hong123@greedy.com");

        System.out.println(memberDTO);
    }
}
