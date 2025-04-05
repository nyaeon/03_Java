package com.ohgiraffers.section07.uses;

public class MemberRepository {
    // static 변수 선언으로 Member 객체를 담는 배열을 데이터베이스로 취급
    private final static Member[] members = new Member[10];  // 한번 변경을 하면 수정이 안됨 (멤버 배열이 생긴 주소값이 수정 불가인 거지, 배열 내용은 변경 가능함)
    private static int count;

    public static boolean store(Member[] newmembers) {

        for (int i = 0; i < newmembers.length; i++) {
            members[count++] = newmembers[i];
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return members;
    }

}
