package com.ohgiraffers.section04.testapp.aggregate;

import java.io.*;
import java.util.ArrayList;

public class MemberRepository {
    private ArrayList<Member> memberList = new ArrayList<Member>();

    /*
     * 최초에 생성될 객체의 생성자
     * 1. 초기 회원 세 명을 넣어둘 예정(스트림을 활용한 객체 출력)
     * 2. 파일로부터 회원 정보를 가져온다.(스트링을 활용한 객체 입력)
     * 3. ArrayList를 활용해 가져온 회원정보를 저장
     * */

    public MemberRepository() {
        File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

        //main을 실행할 때마다 덮어씌우는 문제를 방지하고자 파일이 없을 때만 초기 세팅이 퇴도록 조건문을 작성
        if(!file.exists()){ // exists()의 동작 >> true: 파일이 있을때 false : 파일이 없을 때
            // 파일이 해당 경로에 없을 경우이면 새롭게 만들고 추가
            ArrayList<Member> dafaultMembers = new ArrayList<>();
            dafaultMembers.add(new Member( 1, "user01", "pass01", 20, new String [] {"발레", "수영"} , BloodType.A ));
            dafaultMembers.add(new Member( 1, "user02", "pass02", 20, new String [] {"게임", "수영"} , BloodType.B ));
            dafaultMembers.add(new Member( 1, "user03", "pass03", 20, new String [] {"음악감상", "독서"} , BloodType.AB ));

            saveMembers(file, dafaultMembers);
        }

        // 파일로부터 회원 객체들을 입력받아 memberList에 쌓기
        loadMember(file);
//        for(Member member : memberList){
//            System.out.println("member = " + member);
//        }
    }

    private void loadMember(File file) {


        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {

            while(true){
                memberList.add((Member) ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("회원 정보 모두 로딩됨...");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * 멤버 저장 기능용
     * @param file 파일 정보
     * @param dafaultMembers 저장할 멤버정보
     */
    private void saveMembers(File file, ArrayList<Member> dafaultMembers) {

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            for(Member member : dafaultMembers){
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

    public ArrayList<Member> selectAllmembers() {
        return memberList;
    }

    public Member selectAllMemberBy(int memberNo) {

//        Member mem = null;
//        for (Member member : memberList)
//            if (member.getMembNO() == memberNo) {
//                mem = member;
//            }
//        return mem;


    for(Member member : memberList) {
        if(member.getMembNo() == memberNo) return member;
    }
    return null;

    }

    public int updateMember(Member reform) {

        for (int i = 0; i < memberList.size(); i++) {
            Member iMember = memberList.get(i);
            if(iMember.getMembNo() == reform.getMembNo()) {
                System.out.println("===== 수정 전 기존 회원 정보와 비교 =====");
                System.out.println("reform = " + reform);
                System.out.println("iMember = " + iMember);
                System.out.println("=====================================");

                memberList.set(i, reform);

                File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/member08.dat");
                saveMembers(file, memberList);

                if(!iMember.equals(reform)) return 1;
            }

        }
        return 0;
    }
}
