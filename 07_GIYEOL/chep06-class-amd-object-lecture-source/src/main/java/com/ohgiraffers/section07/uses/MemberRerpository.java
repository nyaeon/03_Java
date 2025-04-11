package com.ohgiraffers.section07.uses;

public class MemberRerpository {
        //static 변수 선언으로 member 객체를 담는 배열을 데이터 베이스로 취급
    private final static Member[] members = new Member[10];
    private static int count;
    
    public static boolean store(Member[] newmembers){
        for(int i=0;i<newmembers.length;i++){
            members[count++] = newmembers[i];
        }
        return true;
    }
    public static Member[] findallmembers(){
        return members;
    }
}
