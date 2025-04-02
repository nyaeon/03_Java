package com.ohgiraffers.section07.uses;

public class MemberFinder {

    public Member[] findAllMembers() {
        return MemberRepository.findAllMembers();
    }
}
