package com.ohgiraffers.section07.uses;

public class MemberServices {

    public void signupMembers() {

        Member[] members = new Member[5];       // [null, null, null, null, null]
        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new Member(2, "user01", "pass02", "유관순", 16, '남');
        members[2] = new Member(3, "user01", "pass03", "이순신", 40, '남');
        members[3] = new Member(4, "user01", "pass04", "신사임당", 30, '남');
        members[4] = new Member(5, "user01", "pass05", "윤봉길", 22, '남');

        MemberRegister memberRegister = new MemberRegister();


    }
}
