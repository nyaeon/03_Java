package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.stream.MyObjectOutput;

import java.io.*;
import java.util.ArrayList;

// 데이터와 입출력(CRUD)을 위해 만들어지며 성공 또는 실패 여부를 반환
public class MemberRepository {

    private ArrayList<Member> memberList = new ArrayList<Member>();

    /*
    * 최초에 생설될 객체의 생성자
    * 1. 초기 회원 세 명을 넣어둘 예정(스트림을 활용한)
    * 2. 파일로부터 회원 정보를 가져온다.(스트림을 활용한 객체 입력)
    * 3. ArrayList를 활용해 가져온 회원정보를 저장
    * */

    public MemberRepository(){
        File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

        // main을 실행할 때마다 덮어씌우는 문제를 방지하고자 파일이 없을 때만 초기 세팅이 되도록 조건문을 작성
        if(!file.exists()) {     // exists()의 동작 >>> true: 파일이 있을 때, false: 파일이 없을 때
            // 파일이 해당 경로에 없을 경우이면 새롭게 만들고 추가
            ArrayList<Member> defaultMembers = new ArrayList<>();
            defaultMembers.add(new Member(1, "user01", "pass01", 20, new String[] {"발레", "수영"}, BloodType.A));
            defaultMembers.add(new Member(2, "user02", "pass02", 10, new String[] {"rpdla", "만화시청"}, BloodType.B));
            defaultMembers.add(new Member(3, "user03", "pass03", 15, new String[] {"음악감상", "독서", "명상"}, BloodType.O));

            saveMembers(file, defaultMembers);
        }

        // 파일로부터 회원 객체들을 입력받아 memberList에 쌓기
        loadMember(file);

        for(Member member : memberList){
            System.out.println("member : " + member);
        }
    }

    private void loadMember(File file) {


        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));) {

            while(true){
                memberList.add((Member) ois.readObject());

            }
        } catch (EOFException e){
            System.out.println("회원 정보 모두 로딩됨...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * 멤버 저장 기능용
     * @param file 파일정보
     * @param defaultMembers 저장할 멤버 정보
     */
    private void saveMembers(File file, ArrayList<Member> defaultMembers) {

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            for (Member member : defaultMembers) {
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

    public ArrayList<Member> selectAllMember() {
        return memberList;
    }

    public Member selectMemberBy(int memberNo) {
//        Member mem = null;
//        for(Member member : memberList){
//            if(member.getMembNo() == membeNo){
//                mem = member;
//            }
//        }
//
//        return mem;

        for(Member member : memberList){
            if(member.getMembNo() == memberNo) return member;
        }
        return null;
    }

    public int insertMember(Member newMember) {
        MyObjectOutput moo = null;

        int result = -1; // 회원 추가 성공 여부

        try {
            moo = new MyObjectOutput(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat", true)));

            // 파일로 새로운 회원 객체 출력(기존 회원에 추가)
        moo.writeObject(newMember);


        // 파일 출력이 성공하면 회원을 관리하는 컬렉션에서도 추가(최신화)
        memberList.add(newMember);

        // 객체 한 개 insert 성공을 의미하는 int값
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

    // insert를 하기 위해 회원번호를 발생시키는데 사용되는 마지막 회원의 번호 추출기능 메소드
    public int selectLastMemeberNo(){

        //마지막 회원을 조회해서 그 회원의 회원번호를 확인(항상 맞다)
        Member lastMember = memberList.get(memberList.size() -1);
        return lastMember.getMembNo();

        //컬렉션의 크기가 곧 회원번호 이므로 마지막 회원의 번호는 컬렉션의 크기(항장 맞지는 x)
//        return memberList.size();
    }

    public int updateMember(Member reform) {
        for(int i=0;i<memberList.size();i++){
            Member iMember = memberList.get(i);

            if(iMember.getMembNo() == reform.getMembNo()){
                System.out.println("=== 수정 전 기존 회원 정보와 비교 ===");
                System.out.println("reform = "  + reform);
                System.out.println("iMember = " + iMember);
                System.out.println("==================================");

                memberList.set(i, reform);

                File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");
                saveMembers(file, memberList);

                if(!iMember.equals(reform)) return 1;

            }
        }
        return 0;
    }

    public int deleteMember(int removeMember) {

        /*
        * 현재는 우리가 마지막 회원 번호 추출을 위해 컬렉션의 size()를 활용하고 있다.
        * (그래서 hard delete(실제 회원 객체를 제거)를 할 수 없고,
        * soft delete(회원 중에 탈퇴와 관련된 속성 수정)를 진행해야 한다.
        *
        * hard delete를 하게 된다면 memberList에서 회원 한명을 remove()메소드를 활용하여 삭제하고
        * 파일 객체 출력을 통해 파일에 컬렉션에 있는 회원들을 다시 덮어씌워야 한다(ObjectOutPutStream를 활용해서)
        * */

//        int result = -1;
//
//        for(Member member : memberList){
//            if(member.getMembNo() == removeMember){
//                member.setId(null);
//            }
//        }
//
//        return result;

        //hard delete 시
        for(int i = 0; i < memberList.size(); i++){

            if(memberList.get(i).getMembNo() == removeMember){
                memberList.remove(i);

                File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

                saveMembers(file, memberList);

                return 1;
            }
        }
        return 0;
    }
}
