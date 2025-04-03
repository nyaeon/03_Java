package com.ohgiraffers.section07.uses;

import java.util.Arrays;

public class MemberService {
    public void signupMembers() {

        Member[] members = new Member[5]; // [null, null, null, null, null] : 초기 상태
        members[0] = new Member(1, "user01", "pass01", "지정호", 30, '남');
        members[1] = new Member(2, "user02", "pass02", "홍길동", 18, '남');
        members[2] = new Member(3, "user03", "pass03", "이순신", 24, '남');
        members[3] = new Member(4, "user04", "pass04", "유관순", 20, '여');
        members[4] = new Member(5, "user05", "pass05", "박주현", 29, '여');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }

    public void showAllMember() {
        MemberFinder finder = new MemberFinder();

        System.out.println("================ 가입된 회원 목록 =================");
        System.out.println(Arrays.toString(MemberRepository.findAllMember()));
    }
}
