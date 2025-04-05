package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {
        // 기본생성자를 이용해서 객체를 생성
        MemberDTO dto = new MemberDTO();
        System.out.println(dto.getId());
        System.out.println(dto.getPwd());
        System.out.println(dto.getName());
        System.out.println(dto.getAge());
        System.out.println(dto.getGender());
        System.out.println(dto.getPhone());
        System.out.println(dto.getEmail());
//    MemberDTO member = new MemberDTO("user01", "pass01", "홍길동", 20, 'M', "010-1234-5678", "hong123@greedy.com");
//
//        System.out.println("변경 후 id : " + member.getId());
//        System.out.println("변경 후 pwd : " + member.getPwd());
//        System.out.println("변경 후 age : " + member.getAge());
//        System.out.println("변경 후 gender : " + member.getGender());
//        System.out.println("변경 후 phone : " + member.getPhone());
//        System.out.println("변경 후 email : " + member.getEmail());
//
//        member.setName("Jane Doe");
//        member.setAge(30);
//
//        System.out.println("변경 후 name : " + member.getName());
//        System.out.println("변경 후 age : " + member.getAge());
//


    }     
}
