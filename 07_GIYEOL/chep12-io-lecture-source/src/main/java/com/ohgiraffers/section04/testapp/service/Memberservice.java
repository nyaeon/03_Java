package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.Memberrepository;

import java.util.ArrayList;


//트랜잭션 처리(성공 실패에 따른 commit/roolback) 및 회원관련 비즈니스 로직 처리
public class Memberservice {
    private final Memberrepository mr;

    public Memberservice() {
        this.mr = new Memberrepository();
    }

    /***
     * 전체 사용자 조회용 메소드
     */
    public void findAllMembers() {
        ArrayList<Member> findMembers = mr.selectAlllMembers();
        for (Member member : findMembers) {
            System.out.println(member);
        }
    }

   public void registMember(Member newMember) {
        int lastMemberNo = mr.selectLasstMemberNo();
        newMember.setMembNo(lastMemberNo +1);

        int result = mr.insertMember(newMember);
        if(result == 1) {
            System.out.println(newMember.getId());
        }
    }


    /***
     * 회원 번호로 회원 찾기 기능
     */
    public void findMemberBy(int memberNo){
        Member selectedMember = mr.selectMemberBY(memberNo);
        if (selectedMember != null) {
            System.out.println("조회된 회원 : " + selectedMember.getId() + "아이디 회원");
        }else {
            System.out.println("없음");
        }
    }
    public Member findMemberForMod(int memNO){
        Member selectedMember = mr.selectMemberBY(memNO);
        if (selectedMember != null) {
            Member newInstance = new Member();
            newInstance.setMembNo(selectedMember.getMembNo());
            newInstance.setId(selectedMember.getId());
            newInstance.setPwd(selectedMember.getPwd());
            newInstance.setAge(selectedMember.getAge());

            String[] hobbies = selectedMember.getHobbies();
            newInstance.setHobbies(hobbies);
            newInstance.setBloodType(selectedMember.getBloodType());
            System.out.println(newInstance.getId());
            return newInstance;
        }else {
            System.out.println("ㅇ벗음");
        }
        return null;
    }
    public void modifyMember(Member reform) {
        int result = mr.updateMember(reform);
        if (result == 1) {
            System.out.println("수정 성공");
            return;
        }
        System.out.println("수정 내역 없음");
    }
    public void removerMember(int removerMember) {
        int result = mr.deleteMember(removerMember);
        if (result == 1) {
            System.out.println("다시 ㄱ");
            return;
        }
        System.out.println("번호 틀림");
    }
}

