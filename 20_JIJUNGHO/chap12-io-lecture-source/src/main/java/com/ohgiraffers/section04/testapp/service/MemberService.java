package com.ohgiraffers.section04.testapp.service;


import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.util.ArrayList;

// 트렌젝션 처리(성공 실패에 따른 commit / rollback) 및 회원 관련 비즈니스 로직 처리
public class MemberService {

    private final MemberRepository mr;

    /***
     * MemberRepository 참조용 메서드
     */
    public MemberService() {
        this.mr = new MemberRepository();
    }

    /***
     * 전체 사용자 조회용 메서드
     */
    public void findAllMembers() {
        ArrayList<Member> findMembers = mr.selectAllMembers();

        for (Member member : findMembers) {
            System.out.println(member);
        }


    }

    /****
     * 회원번호로 회원 찾기 기능
     * @param memberNo // 회원번호
     */
    public void findMemberBy(int memberNo) {

        Member selectedMember = mr.selectMemberBy(memberNo);

        if (selectedMember != null) {
            System.out.println("조회된 회원은 :  " + selectedMember.getId() + " 아이디 회원");
        } else {
            System.out.println("그런 회원은 없습니다.🫢💦");
        }
    }

    /***
     * 회원 추가 기능
     * @param newMember // 새로운 회원 객체
     */
    public void registMember(Member newMember) {
        int lastMemberNo = mr.selectLastMemberNo();
        newMember.setMemNo(lastMemberNo + 1);

        int result = mr.insertMember(newMember);
        if (result == 1) {
            System.out.println(newMember.getId() + "님 회원가입 해주셔서 감사합니다.");
        }

        // commit, rollback 처리 예정

    }


    // 입력받은 번호와 일치하는 회원 찾기 기능
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
            System.out.println("그런 회원은 없단다.");
        }
        return null;
    }

    public void modifyMember(Member reform) {
        int result = mr.updateMember(reform);

        if (result == 1) {
            System.out.println("수정 성공!!");
            return;
        }
        System.out.println("수정 내역 없음");
    }

    // 회원 탈퇴 기능
    public void removeMember(int removeMemberNo) {
        int result = mr.deleteMember(removeMemberNo);
        if (result == 1) {
            System.out.println("다시 돌아오세요~~~");
            return;
        }
        System.out.println("회원 번호 틀렸다는데요?!?!");
    }
}
