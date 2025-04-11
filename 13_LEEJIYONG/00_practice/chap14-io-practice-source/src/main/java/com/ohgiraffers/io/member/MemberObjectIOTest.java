package com.ohgiraffers.io.member;

public class MemberObjectIOTest {


    public static void main(String[] args) {
        MemberManager memberManager = new MemberManager();

        memberManager.readMembers();

        Member member = new Member("user05", "1234", "신사임당", "sinsa@sh.org",
            300, '여', 9000.0);

        memberManager.addMember(member);
    }
}
