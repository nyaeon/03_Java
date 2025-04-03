package com.ohgiraffers.section07.uses;

public class MemberRepository {
    // static 변수 선언으로 Member 객체를 담는 배열을 데이터베이스로 취급(임시로)

    // 배열에 붙은 final은 배열에 대한 메모리 주소만 바꿀 수 없음. 안에 Member는 바뀔 수 있음
    private final static Member[] members = new Member[10];
    private static int count = 0;

    public static boolean store(Member[] newMembers) {
        for (int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return members;
    }
}
