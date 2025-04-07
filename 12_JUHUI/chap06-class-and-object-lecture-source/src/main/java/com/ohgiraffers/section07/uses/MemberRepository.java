package com.ohgiraffers.section07.uses;

public class MemberRepository {

    // static 변수 선언으로 Member 객체를 담는 배열을 데이터베이스로 취급
    private final static Member[] members = new Member[5]; // 한번 등록하면 수정안됨.멤버 배열이 생성된 주소값이 변하지 않는 것임.
    // 그래서 그냥 거기서의 값 수정은 가능.
    private static int count;

    public static boolean store(Member[] newMembers) {

        for(int i = 0; i < members.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }
    public static Member[] findAllMembers() {
        return members;
    }
}
