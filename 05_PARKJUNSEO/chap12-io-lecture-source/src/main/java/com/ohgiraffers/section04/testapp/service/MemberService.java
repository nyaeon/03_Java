package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.util.ArrayList;

// 트랜잭션 처리 (성공 실패에 따른 commit/rollback) 및 회원 관련 비즈니스 로직 처리
public class MemberService {
    private final MemberRepository mr;

    public MemberService() {
        this.mr = new MemberRepository();
    }

    /***
     * 전체 사용자 조회용 메소드
     */
    public void findAllMembers() {

       ArrayList<Member> findAllmems =  mr.selectAllMembers();

       for (Member member : findAllmems) {
           System.out.println(member);
       }
    }

    /***
     * 회원 번호로 회원 찾기 기능
     * @param memberNo 회원 번호
     */
    public void findMemberBy(int memberNo) {
        Member selectedMember = mr.selectMemberBy(memberNo);
        if (selectedMember != null) {
            System.out.println("조회된 회원은 : " + selectedMember.getId() + " 회원입니다.");
        } else {
            System.out.println("회원 정보를 불러오지 못했습니다.");
        }

    }

    public void registerMember(Member newMember) {
        int lastMemberNO = mr.selectLastMemberNo();
        newMember.setMnmbNo(lastMemberNO + 1);

        int result = mr.insertMember(newMember);
        if (result == 1) {
            System.out.println(newMember.getId() + "님 회원가입 해주셔서 감사합니다.");
        }
    }

    public Member findMemberForMod(int memNo) {
        Member selectedMember = mr.selectMemberBy(memNo);
        if (selectedMember != null) {
            Member newInstances = new Member();
            newInstances.setMnmbNo(selectedMember.getMnmbNo());
            newInstances.setId(selectedMember.getId());
            newInstances.setPwd(selectedMember.getPwd());
            newInstances.setAge(selectedMember.getAge());

            String[] copiedHobbies = selectedMember.getHobbies().clone();
            newInstances.setHobbies(copiedHobbies);
            newInstances.setBloodType(selectedMember.getBloodType());

            System.out.println("조회된 회원은 : " + newInstances.getId() + " 아이디 회원");
            return newInstances;
        } else {
            System.out.println("회원 정보를 불러오지 못했습니다.");
        }
        return null;
    }

    public void modifyMember(Member reform) {
        int result = mr.updateMember(reform);

        if(result == 1){
            System.out.println("수정 성공");
            return;
        }
        System.out.println("수정 내역 없음");
    }

    public void removeMember(int removeMemberNo) {
        int result = mr.deledteMember(removeMemberNo);

        if(result == 1){
            System.out.println("다시 돌아오세요!!");
            return;
        }

        System.out.println("회원번호가 옳지 않습니다.");
    }

}
