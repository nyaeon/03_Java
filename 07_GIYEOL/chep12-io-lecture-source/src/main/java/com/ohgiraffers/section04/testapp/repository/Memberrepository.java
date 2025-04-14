package com.ohgiraffers.section04.testapp.repository;
//데이터와 입출력 (CRUD)를 위해 만들어지며 성공 또는 실패 여부 반환

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.stream.Myobjectoutput;

import java.io.*;
import java.util.ArrayList;

public class Memberrepository {

    private ArrayList<Member> membersList = new ArrayList<Member>();

    /***
     * 최초에 생성될 객체의 생성자
     * 1.초기 회원 세 명을 넣어둘 예정(스트림을 활용한 객체 출력)
     * 2.파일로부터 회원 정보를 가져옴(스트림을 활용한 객체 입력)
     * 3.ArrayList를 활용해 가져온 회원 정보를 저장
     */
    public Memberrepository() {
        File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/members.db.dat");

        //main을 실행할 때마다 덮어씌우는 문제를 방지하고자 파일이 없을 때만 초기 세팅이 되도록 조건문을 작성

        if (!file.exists()) { //exists()의 동작 >> true :파일이 있을 때 , false: 파일이 없을 때
            //파일이 해당 경로에 없을 때 새롭게 추가
            ArrayList<Member> defaultMembers = new ArrayList<>();
            defaultMembers.add(new Member(1, "user01", "pass01", 20, new String[]{"발레", "수영"}, BloodType.A));
            defaultMembers.add(new Member(2, "user02", "pass02", 10, new String[]{"게임", "수영"}, BloodType.B));
            defaultMembers.add(new Member(3, "user03", "pass03", 15, new String[]{"명상", "독서", "게임"}, BloodType.AB));

            saveMembers(file, defaultMembers);

        }
        //파일로부터 회원 객체들을 입력받아 memberList에 쌓기
        loadMember(file);

    }

    private void loadMember(File file) {


        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));) {
            while (true) {
                membersList.add((Member) ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("정보 모두 로딩");
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * 멤버 저장 기능용
     * @param file 파일 정보
     * @param Members 저장할 멤버정보
     */
    private void saveMembers(File file, ArrayList<Member> Members) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            for (Member member : Members) {
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

    public ArrayList<Member> selectAlllMembers() {
        return membersList;
    }

    public Member selectMemberBY(int memberNo){
       for (Member member : membersList) {
            if (member.getMembNo() == memberNo) return member;  
       }
        return null;
    }
    public int insertMember(Member newmember) {
        membersList.add(newmember);
        Myobjectoutput moo = null;
        int result = -1;//회원 추가 성공여부
        try {
            moo = new Myobjectoutput(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/com/ohgiraffers/section04/testapp/db/memberDB.dat",true)));
            //파일로 새로운 회원 객체 출력 (기존 회원에 추가)

            //파일 출력이 성공하면 회원을 관리하는 컬랙션에도 추가(최신화)
            moo.writeObject(newmember);
            //객체 한 개 insert 성공을 의미하는 int값
            result = 1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (moo != null) {
                try{
                    moo.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }
        return result;
    }

    public int updateMember(Member reform){
        for(int i = 0; i < membersList.size(); i++){
            Member iMember = membersList.get(i);
            if (iMember.getMembNo() == reform.getMembNo()){
                System.out.println(reform);
                System.out.println(iMember);

                membersList.set(i,reform);
                File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/members.db.dat");
                saveMembers(file, membersList);
                if (!iMember.equals(reform)) return 1;

            }
        }
        return 0;

    }
    //insert 하기 위해 회원번호를 발생시키는데 사용되는 마지막 회원의 번호를 추출하는 기능 메소드
    public int selectLasstMemberNo() {
        Member lastmember = membersList.get(membersList.size() - 1);
        //마지막 회원을 조회해서 그 회원 번호를 조회(맞음)
        return lastmember.getMembNo();

        //컬렉션의 크기가 곧 회원번호이므로 마지막 회원의 번호는 컬렉션의 크기(항상 맞지는 않음)
        // return memberList.size();

    }

    public int deleteMember(int removeMember){


        /***
         * 현재 우리가 마지막 회원 번호 추출을 위해 컬렉션의 size() 를 활용하고 있다
         * 그래서 hard delete 를 할 수 없고
         * soft delete를 진행해야 한다
         *
         * hard delete흫 하게 돠면 memberList에서 회원 한명을 remove()메소드를 활용하여 삭제 하고
         * 파워 객체 출력을 통해 파일 컬렉션에 있는 회원들을 다시 덮어씌워야 한다 (objectoutputstream을 활용해서)
         */
        //soft delete시
               int result = -1;
        //       for(Meber men : memberList){
        //           if(mem.getMembNo() == removerMember){
        //               mem.setId(null);
        //               result = 1;
        //           }
        //       }
        //       return result;
        //hard delete
        for (int i =0; i< membersList.size(); i++){
            if (membersList.get(i).getMembNo() == removeMember){
                membersList.remove(i);
                File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/members.db.dat");
                saveMembers(file, membersList);
                result = 1;
            }
        }
        return 0;
    }

}











