package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;
import java.util.ArrayList;

public class MemberService {

    private final MemberRepository mr;

    public MemberService() {
        this.mr = new MemberRepository();
    }

    public void findAllMember() {
        ArrayList<Member> members = mr.selectAllMembers();
        for (Member member : members) {
            System.out.println(member);
        }
    }


    public void findMemberBy(int memberNo) {
        Member selectedMember = mr.selectMemberBy(memberNo);
        if (selectedMember == null) {
            System.out.println("회원이 존재하지 않습니다.");
            return;
        }
        System.out.println(selectedMember);
    }

    public void registMember(Member newMember) {
        if (mr.insertMember(newMember) == 1) {
            System.out.println("회원이 성공적으로 등록되었습니다.");
            return;
        }
        System.out.println("회원 등록에 실패했습니다.");
    }
}
