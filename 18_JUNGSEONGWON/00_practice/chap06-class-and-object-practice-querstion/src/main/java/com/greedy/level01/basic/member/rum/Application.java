package com.greedy.level01.basic.member.rum;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {
        MemberDTO mT = new MemberDTO();
        //getter를 이용해서 필드의 초기값 확인
        //setter를 이용해서 필드 값 변경
        //getter를 이용해서 변경된 필드값 확인
        System.out.println("id : " + mT.getId());
        System.out.println("pwd : " + mT.getPwd());
        System.out.println("age : " + mT.getAge());
        System.out.println("gender : " + mT.getGender());
        System.out.println("phone : " + mT.getPhone());
        System.out.println("email : " + mT.getEmail());
        System.out.println("==================================");
        MemberDTO user1 = new MemberDTO();

        user1.setId("user1");
        user1.setPwd("pass01");
        user1.setName("홍길동");
        user1.setAge(20);
        user1.setGender('M');
        user1.setPhone("010-1234-5678");
        user1.setEmail("hong123@greedy.com");

        System.out.println("id : " + user1.getId());
        System.out.println("pwd : " + user1.getPwd());
        System.out.println("name : " + user1.getName());
        System.out.println("age : " + user1.getAge());
        System.out.println("gender : " + user1.getGender());
        System.out.println("phone : " + user1.getPhone());
        System.out.println("email : " + user1.getEmail());
    }
}
