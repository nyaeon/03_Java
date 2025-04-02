package com.ohgiraffers.section07.uses;

public class MemberFinder {

    public Member[] FindAllMembers() {
        return MemberRepository.findAllMember();
    }

}
