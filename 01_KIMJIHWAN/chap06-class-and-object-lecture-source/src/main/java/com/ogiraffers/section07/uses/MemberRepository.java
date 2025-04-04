package com.ogiraffers.section07.uses;

public class MemberRepository {
    // 주소값을 생성하여 변경 불가 -> 처음에 생성되어 있는 크기는 변경 불가, 배열 값은 변경 가능
    // 데이터베이스와 직접적 연관
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
