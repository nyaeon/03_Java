package com.ohgiraffers.section07.uses;

public class MemberRepository {

    // static변수 선언으로 Member 객체를 담는 배열을 데이터베이스로 취급
    // members 배열에 생성된 주소값 변경 x, 주소값 안에 배열 값은 변경 가능
    private final static Member[] members = new Member[10];
    // 몇번째 인덱스인지 확인 용도
    private static int count;

    public static boolean store(Member[] newMembers) {

        for (int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }

    public static Member[] findAllMember () {
        return members;
    }


}
