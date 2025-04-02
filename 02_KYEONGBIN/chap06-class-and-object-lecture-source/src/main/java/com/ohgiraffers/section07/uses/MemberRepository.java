package com.ohgiraffers.section07.uses;

public class MemberRepository {
    // static변수 선언으로 Member 객체를 담는 배열을 데이터베이스로 취급
    private final static Member[] members = new Member[10];
    private static int count;

    public static boolean store(Member[] newMembers) {

        for(int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return members;
    }
}
