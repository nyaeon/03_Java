package com.ohgiraffers.section07.users;

public class MemberFinder {

    public Member[] findAllMembers() {
        return MemberRepository.findAllMembers();
    }
}
