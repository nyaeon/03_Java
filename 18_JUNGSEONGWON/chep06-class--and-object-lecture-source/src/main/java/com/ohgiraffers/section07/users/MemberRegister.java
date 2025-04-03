package com.ohgiraffers.section07.users;

public class MemberRegister {
    public void regis(Member[] members) {

        System.out.println("회원을 등록하빈다.");

        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i].getName() + "님을 회원 등록에 성공했습니다.");
        }

        if (MemberRepository.store(members)){
            System.out.println("총" + members.length + "명의 회원 등록에 성공했습니다.");
        }
    }
}
