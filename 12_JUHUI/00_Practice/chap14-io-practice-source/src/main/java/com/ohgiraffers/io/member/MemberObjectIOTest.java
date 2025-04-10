package com.ohgiraffers.io.member;

public class MemberObjectIOTest {

    public static void main(String[] args) {

        MemberManger memberManger = new MemberManger();
        memberManger.readMembers();

//        Member member = new Member("user04","1234", "신사임당", "sinsa@sh.org",
//                300, '여', 9000.0);
//        memberManger.addMember(member); //같은 방법임
        memberManger.addMember(new Member("user04","1234", "신사임당", "sinsa@sh.org",
                300, '여', 9000.0));

        memberManger.readMembers();
    }
}
