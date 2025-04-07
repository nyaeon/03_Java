package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {
        // 기본생성자를 이용해서 객체를 생성
        MemberDTO dto = new MemberDTO();

        // getter를 이용해서 필드의 초기값 확인
        System.out.println("id : " + dto.getId());
        System.out.println("pwd : " + dto.getPwd());
        System.out.println("name : " + dto.getName());
        System.out.println("age : " + dto.getAge());
        System.out.println("phone : " + dto.getPhone());
        System.out.println("email : " + dto.getEmail());

        // setter를 이용해서 필드 값 변경
        dto.setId("user01");
        dto.setPwd("pass01");
        dto.setName("홍길동");
        dto.setAge(20);
        dto.setGender('M');
        dto.setPhone("010-1234-5678");
        dto.setEmail("hong123@greedy.com");

        // getter를 이용해서 변경된 필드값 확인
        System.out.println("변경 후 id : " + dto.getId());
        System.out.println("변경 후 pwd : " + dto.getPwd());
        System.out.println("변경 후 name : " + dto.getName());
        System.out.println("변경 후 age : " + dto.getAge());
        System.out.println("변경 후 phone : " + dto.getPhone());
        System.out.println("변경 후 email : " + dto.getEmail());
    }     
}
