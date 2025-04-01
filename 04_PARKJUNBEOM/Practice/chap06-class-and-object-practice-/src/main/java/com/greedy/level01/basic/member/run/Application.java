package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {
    // getter를 이용해서 필드의 초기값 확인
    // setter를 이용해서 필드 값 변경
    // getter를 이용해서 변경된 필드값 확인
        MemberDTO member1 = new MemberDTO();
        System.out.println(member1.getId());
        System.out.println(member1);
        member1.setId("user01");
        member1.setPwd("pass01");
        member1.setName("홍길동");
        member1.setAge(20);
        member1.setGender('M');
        member1.setPhone("010-1234-5678");
        member1.setEmail("hong123@greedy.com");
        System.out.println(member1);
    }
}
