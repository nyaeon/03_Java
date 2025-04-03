package com.ohgiraffers.section07.uses;

import java.util.Arrays;

public class MemberService {

    public void signUpMembers() {

        Member[] members = new Member[5]; // 주소값이 들어가있는데 주소값을 참조하면 null이 들어가있음.
        // [ null, null, null, null, null]
        members[0] = new Member(1,"user01","pass01","홍길동",20,'남');
        members[1] = new Member(2,"user01","pass01","홍길동",20,'남');
        members[2] = new Member(3,"user01","pass01","홍길동",20,'남');
        members[3] = new Member(4,"user01","pass01","홍길동",20,'남');
        members[4] = new Member(5,"user01","pass01","홍길동",20,'남');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }

    public void showAllMember() {
        MemberFinder finder = new MemberFinder();
        System.out.println("======== 가입된 회원 목록 =======");
        System.out.println(Arrays.toString(finder.findAllMembers()));
    }
}
