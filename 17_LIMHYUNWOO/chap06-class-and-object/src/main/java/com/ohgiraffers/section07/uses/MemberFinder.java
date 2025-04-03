package com.ohgiraffers.section07.uses;

public class MemberFinder {

    public Member[] findMembers() {
        return MemberRepository.findAllMembers();
    }
}
