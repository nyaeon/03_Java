package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.repository.MemberRepository;

// 트랜잭션 처리(성공 실패에 따른 commit/rollback) 및 회원관련 비즈니스 로직 처리
public class MemberService {

    private final MemberRepository mr;

    public MemberService() {
        this.mr = new MemberRepository();
    }
}
