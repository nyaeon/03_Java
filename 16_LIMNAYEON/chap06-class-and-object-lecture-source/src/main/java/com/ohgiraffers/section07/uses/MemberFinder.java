package com.ohgiraffers.section07.uses;

import java.util.Arrays;

public class MemberFinder {

    public Member[] findAllMembers() {
        return MemberRepository.findallMembers();
    }
}
