package com.ohgiraffers.section07.uses;

import com.sun.source.tree.MemberReferenceTree;

import java.util.Arrays;

public class Memberservice {
    public void signupmembers(){
        Member[] members = new Member[5]; //[null,null,null,null,null]
        members[0] = new Member(1,"user01","pass01","홍길동",20,'남');
        members[1] = new Member(2,"user02","pass02","유관순",16,'여');
        members[2] = new Member(3,"user03","pass03","이순신",40,'남');
        members[3] = new Member(4,"user04","pass04","신사임당",30,'여');
        members[4] = new Member(5,"user05","pass05","윤봉길",22,'남');

        Memberregister memberregister = new Memberregister();
        memberregister.regist(members);

    }

    public void showallmembers() {
        Memberfinder finder = new Memberfinder();
        System.out.println("===========가입된 회원 목록 ============");
        System.out.println(Arrays.toString(finder.findallmembers()));
    }
}
