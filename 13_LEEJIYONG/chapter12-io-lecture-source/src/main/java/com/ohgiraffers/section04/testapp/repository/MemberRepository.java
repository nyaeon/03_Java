package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.stream.MyObjectOutput;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberRepository {

    private ArrayList<Member> members = new ArrayList<>();

    /*
     * 최초에 생성될 객체의 생성자
     * 1. 초기 회원 세 명을 넣어둘 예정(스트림을 활용한 객체출력)
     * 2. 파일로부터 회원 정보를 가져온다.(스트림을 활용한 객체 입력)
     * 3. ArrayList를 활용해 가져온 회원정보를 저장
     */

    public MemberRepository() {
        File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

        // main을 실행할 때마다 덮어씌우는 문제를 방지하고자 파일이 없을 때만 초기 세팅이 되도록 조건문을 작성
        if (!file.exists()) {
            // 파일이 해당 경로에 없을 경우이면 새롭게 만들고 추가
            ArrayList<Member> defaultMembers = new ArrayList<>();
            defaultMembers.add(
                new Member(1, "user01", "pass01", 20, new String[]{"발레", "수영"}, BloodType.A));
            defaultMembers.add(
                new Member(2, "user03", "pass02", 10, new String[]{"게임", "만화시청"}, BloodType.B));
            defaultMembers.add(
                new Member(3, "user03", "pass03", 15, new String[]{"음악감상", "독서", "명상"},
                    BloodType.O));
            saveMembers(file, defaultMembers);
        }

        // 파일로부터 회원 객체들을 입력받아 memberList에 쌓기

        loadMember(file);

        for (Member member : members) {
            System.out.println(member);
        }
    }

    private void loadMember(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(
            new BufferedInputStream(new FileInputStream(file)));) {

            while (true) {
                members.add((Member) ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("회원 정보 모두 로딩됨...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private void saveMembers(File file, ArrayList<Member> members) {

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            for (Member member : members) {
                oos.writeObject(member);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public ArrayList<Member> selectAllMembers() {
        return members;
    }

    public Member selectMemberBy(int memberNo) {
        for (Member member : members) {
            if (member.getMembNo() == memberNo) {
                return member;
            }
        }

        return null;
    }

    public int insertMember(Member newMember) {
        MyObjectOutput moo = null;

        int result = -1; // 회원 추가 성공 여부

        try {
            moo = new MyObjectOutput(new BufferedOutputStream(new FileOutputStream(
                "src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat", true)));
            moo.writeObject(newMember);

            members.add(newMember);

            result = 1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (moo != null) {
                try {
                    moo.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return result;
    }
}
