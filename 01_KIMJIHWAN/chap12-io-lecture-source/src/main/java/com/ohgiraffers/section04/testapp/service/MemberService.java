package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.aggregate.MemberRepository;

import java.util.ArrayList;

public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    public void findAllMembers() {

        ArrayList<Member> members = mr.selectAllmembers();

        for(Member member : members) {
            System.out.println(member);
        }
    }

    /***
     * 회원아이디로 회원찾기 기능
     * @param memberNo 회원번호
     */
    public void findMemberBy(int memberNo) {

        Member selectedMember = mr.selectAllMemberBy(memberNo);

        if(selectedMember != null) {
            System.out.println("조회된 회원은 : " + selectedMember.getId() + " 아이디 회원 ");
        } else {
            System.out.println("그런 회원은 없네요~~~!");
        }

    }

    public void registMember (Member newMember) {

        int lastMemberNo = mr.selectLastMemberNo();
        newMember.setMembNo(lastMemberNo + 1);

        int result = mr.insertMember(newMember);
        if(result == 1) {
            System.out.println(newMember.getId() + "님 회원가입 해 주셔서 감사합니다.!");
        }
    }


    public Member findMemberForMod(int memNo) {

        Member selectedMember = mr.selectAllMemberBy(memNo);

        if(selectedMember != null) {
            Member newInstance = new Member();
            newInstance.setMembNo(selectedMember.getMembNo());
            newInstance.setId(selectedMember.getId());
            newInstance.setPwd(selectedMember.getPwd());
            newInstance.setAge(selectedMember.getAge());

            String[] copiedHobbies = selectedMember.getHobbies().clone();
            newInstance.setHobbies(copiedHobbies);
            newInstance.setBloodType(selectedMember.getBloodType());
        } else {
            System.out.println("그런 회원은 없네요!");
        }

        return null;
    }

    public void modifyMember(Member reform) {

        int result = mr.updateMember(reform);

        if(result == 1) {
            System.out.println("수정 성공!");
            return;
        }

        System.out.println("수정 내역 없음");
    }

    public void removeMember(int removeMemberNo {
        int result = mr.deleteMember(removeMemberNo);

        if (result == 1) {
            System.out.println("다시 돌아오세요~~~!!");
            return;

        }
        System.out.println("회원 번호 틀렸나 본데요?");
    }

}
