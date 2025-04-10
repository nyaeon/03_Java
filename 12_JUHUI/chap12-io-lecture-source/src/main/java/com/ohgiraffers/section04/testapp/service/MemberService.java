package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.util.ArrayList;

// 트랜잭션 처리(성공 실패에 따른 commit/rollback) 및 회원관련 비즈니스 로직 처리
public class MemberService {

    //private final MemberRepository mr = new MemberRepository();//서비스가 레퍼지토리의 내용을 가져와야 할 수 있으니 객체 생성해서 연결해줘야함.

    private final MemberRepository mr;

    public MemberService() {
        this.mr = new MemberRepository(); // 이런식으로 객체 생성해도 됨. 위와 같은 방법임.
    }


    //전체 사용자 조회용 메소드
    public void findAllMembers() {
        //mr.selectAllMembers();
        ArrayList<Member> findMembers = mr.selectAllMembers();

        for (Member member : findMembers) {
            System.out.println(member);
        }
    }

    /***
     * 회원 번호로 회원 찾기 기능
     * @param meberNo 회원 번호
     */
    public void findMemberBy(int meberNo) {
        Member selectedMember = mr.selectMemberBy(meberNo);

        if (selectedMember != null) { // 널이 아니니까 조회 되었을 때임. 조회된 내용이 있을 때.
            System.out.println("조회된 회원은 " + selectedMember.getId() + " 아이디 회원");
        } else {
            System.out.println("그런 회원은 없네요~~!");
        }
    }

    // 회원가입
    public void registMember(Member newMember) {

        int lastMemberNo = mr.selectLastMemberNo();
        newMember.setMemberNo(lastMemberNo + 1);

        int result = mr.insertMember(newMember);// 참조
        if (result == 1) {
            System.out.println(newMember.getId() + "님 회원가입 해주셔서 감사합니다.");
        }
    }

    // 회원정보수정
    public Member findMemberForMod(int memNo) {
        Member selectedMember = mr.selectMemberBy(memNo);
        if (selectedMember != null) { // 조회된 내용을 넘겨주는 작업
            Member newInstance = new Member();
            newInstance.setMemberNo(selectedMember.getMemberNo());
            newInstance.setId(selectedMember.getId());
            newInstance.setPwd(selectedMember.getPwd());
            newInstance.setAge(selectedMember.getAge());

            String[] copiedHobbies = selectedMember.getHobbies().clone(); //.clone() 얕은 복사
            newInstance.setHobbies(copiedHobbies);
            newInstance.setBloodType(selectedMember.getBloodType());

            System.out.println("조회된 회원은 : " + newInstance.getId() + " 아이디 회원");
            return newInstance;
        } else {
            System.out.println("그런 회원은 없네요!");
        }
        return null;
    }

    // 회원 수정 성공여부
    public void modifyMember(Member reform) {
        int result = mr.updateMember(reform);

        if (result == 1) {
            System.out.println("수정 성공!");
            return;
        }
        System.out.println("수정 내역 없음");
    }

    // 회원 탈퇴(hard delete)
    public void removeMember(int removeMemberNo) {
        int result = mr.deleteMember(removeMemberNo);

        if (result == 1) {
            System.out.println("다시 돌아오세요~~~!!");
            return;
        }

        System.out.println("회원 번호 틀렸나 본데요?");
    }
}
