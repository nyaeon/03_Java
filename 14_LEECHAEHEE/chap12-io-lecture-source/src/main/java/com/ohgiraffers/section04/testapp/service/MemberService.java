package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.util.ArrayList;

// 트랜잭션 처리(성공 실패에 따른 commit / rollback) 및 회원관련 비즈니스 로직 처리
public class MemberService {
    private final MemberRepository mr;

    public MemberService() {
        mr = new MemberRepository();
    }

    /***
     * 전체사용자조회용 메소드
     */
    public void findAllMembers() {
        ArrayList<Member> findMembers =  mr.selectAllMembers();
        for (Member member : findMembers) {
            System.out.println(member);
        }
    }

    /***
     * 회원아이디로 회원찾기 기능
     * @param memberNo 회원번호
     */
    public void findMemberBy(int memberNo) {
        Member selectedMember = mr.selectMemberBy(memberNo);
        if(selectedMember != null) {
            System.out.println("조회된 회원은 : " + selectedMember.getId() + " 아이디 회원입니다.");
        } else {
            System.out.println("조회된 회원이 읎습니다.");
        }
    }

    public void registMember(Member newMember) {
       int lastMemberNo = mr.selectLastMemberNo();
       newMember.setMemNo(lastMemberNo + 1);

        int result = mr.insertMember(newMember);
        if(result == 1) {
            System.out.println(newMember.getId() + "님 회원가입 해주셔서 감사합니댜!");
        }
    }

    public Member findMemberForMod(int memNo) {
        Member selectedMember = mr.selectMemberBy(memNo);
        if (selectedMember != null) {
            Member newInstance = new Member();
            newInstance.setMemNo(selectedMember.getMemNo());
            newInstance.setId(selectedMember.getId());
            newInstance.setPwd(selectedMember.getPwd());
            newInstance.setAge(selectedMember.getAge());

            String[] copiedHobbies = selectedMember.getHobbies().clone();
            newInstance.setHobbies(copiedHobbies);
            newInstance.setBloodType(selectedMember.getBloodType());

            System.out.println("조회된 회원은 : " + newInstance.getId() + " 아이디 회원");
            return newInstance;
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

    public void removeMember(int removeMemberNo) {
        int result = mr.deleteMember(removeMemberNo);

        if(result == 1) {
        System.out.println("다시 돌아와 ~");
        }
    }

}


