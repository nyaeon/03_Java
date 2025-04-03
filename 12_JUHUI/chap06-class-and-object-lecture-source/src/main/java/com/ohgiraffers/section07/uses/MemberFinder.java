package com.ohgiraffers.section07.uses;

public class MemberFinder {

    public Member[] findAllMembers() {
        return MemberRepository.findAllMembers();
        //static이라 클래스명.메소드로 불러올 수 있는 거.
    }
}
