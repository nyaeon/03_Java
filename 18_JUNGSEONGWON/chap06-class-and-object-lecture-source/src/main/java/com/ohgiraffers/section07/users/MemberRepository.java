package com.ohgiraffers.section07.users;

public class MemberRepository {
    // static 변수 선언으로 Member 객체를 담는 배열을 데이터베이스로 취급
    private final static Member[] members = new Member[10];
    // Member 배열의 주소값을 변경 할 수 없고 안의 members의 값들은 변경 할 수 있다.
    private static int count;

    public static boolean store(Member[] newmembers){

        for (int i = 0; i < members.length; i++){
            members[count++] = newmembers[i];
        }
        return true;
    }
    public static Member[] findAllMembers(){
        return members;
    }
}
