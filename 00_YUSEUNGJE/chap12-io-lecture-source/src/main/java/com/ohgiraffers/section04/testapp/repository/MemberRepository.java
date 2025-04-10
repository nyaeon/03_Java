package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;

import java.io.*;
import java.util.ArrayList;

// 데이터와 입출력(CRUD)을 위해 만들어지며 성공 또는 실패 여부를 반환
public class MemberRepository {

    private ArrayList<Member> memberList = new ArrayList<Member>();

    /*
    * 최초에 생성될 객체의 생성자
    * 1. 초기 회원 세 명을 넣어둘 예정(스트림을 활용한 객체 출력)
    * 2. 파일로부터 회원 정보를 가져온다.(스트림을 활용한 객체 입력)
    * 3. ArrayList를 활용해 가져온 회원정보를 저장
    * */

    public MemberRepository() {

        File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

        // main을 실행할 때마다 덮어씌우는 문제를 방지하고자 파일이 없을 때만 초기 세팅이 되도록 조건문을 작성
        if(!file.exists()) { // exists()의 동작 >>> true: 파일이 있을때 false: 파일이 없을때
            // 파일이 해당 경로에 없을 경우이면 새롭게 만들고 추가
            ArrayList<Member> defaultMembers = new ArrayList<>();
            defaultMembers.add(new Member(1, "user01", "pass01", 20, new String[] {"발레", "수영"}, BloodType.A));
            defaultMembers.add(new Member(2, "user02", "pass02", 10, new String[] {"게임", "만화시청"}, BloodType.B));
            defaultMembers.add(new Member(3, "user03", "pass03", 15, new String[] {"음악감상", "독서", "명상"}, BloodType.O));

            saveMembers(file, defaultMembers);
        }
    }

    private void saveMembers(File file, ArrayList<Member> members) {

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            for(Member member : members) {
                oos.writeObject(member);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
