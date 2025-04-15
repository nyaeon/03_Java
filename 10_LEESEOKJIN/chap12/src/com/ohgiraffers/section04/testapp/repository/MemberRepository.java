package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.Member;

import java.io.File;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class MemberRepository {
    private final ArrayList<Member> members = new ArrayList<>();

    /*
    최초에 생성될 객체의 생성자
    1. 초기 회원 세 명을 넣어둘 예정(스트림을 활용한 객체 출력)
    2. 파일로부터 회원 정보를 가져온다. (스트림을 활용한 객체 입력)
    3. ArrayList를 활용해 가져온 회원정보를 저장
     */

    public MemberRepository() {
        var file = new File("members.dat");

        // main을 실행할 때마다 덮어씌우는 문제를 방지하고자 파일이 없을 때만 초기 세팅이 되도록 조건문을 작성
        if (!file.exists()) {

        }
    }
}
