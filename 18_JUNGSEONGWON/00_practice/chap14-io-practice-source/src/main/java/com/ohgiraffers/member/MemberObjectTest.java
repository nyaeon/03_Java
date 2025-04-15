package com.ohgiraffers.member;

public class MemberObjectTest {
    public static void main(String[] args) {
        MemberManager memberManager = new MemberManager();

        // 파일에서 멤버 읽기 및 출력
        memberManager.readMembers();

        // 새로운 멤버 추가
        Member newMember = new Member("user04", "1234", "신사임당", "sinsa@sh.org", 300, '여', 9000.0);

        // 새로운 멤버를 members 배열에 추가하고 파일에 저장
        memberManager.addMember(newMember);

        // 멤버 추가 후 다시 읽기 및 출력
        memberManager.readMembers();
    }
}
