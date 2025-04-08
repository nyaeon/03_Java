package com.ohgiraffers.section07.uses;

public class Memberregister {


    public void regist(Member[] members) {
        System.out.println("회원 등록");
        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i].getName()+"회원등록에 성공했습니다.");
        }
        if(MemberRerpository.store(members)){
            System.out.println("총 "+members.length+ "명의 회원 등록에 성공했습니다.");
        }
    }
}
