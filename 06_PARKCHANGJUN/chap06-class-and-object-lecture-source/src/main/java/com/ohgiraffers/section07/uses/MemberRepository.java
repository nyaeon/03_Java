package com.ohgiraffers.section07.uses;

public class MemberRepository {
    // static변수 선언으로 Member 객체를 담는 배열을 데이터베이스로 취급
    // final
    // ex) 10개 배열을 만들면 이건 수정 불가
    // ex) 안에 있는 각각의 값들은 변경 가능
    // 멤버 배열이 생성된 주소값 (변경되지 않는 값)
    // 배열 안에 있는 값은 변경 가능
    // static을 준 이유 : static 변수 선언으로 Member 객체를 담는 배열을 데이터베이스로 취급

    private final static Member[] members = new Member[10];
    private static int count;

    public static boolean store(Member[] newMembers) {

        for(int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return members; // 현재 몇명이 들어가는지 확인 할 수 있음
    }
}


