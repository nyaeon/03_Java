package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.stream.MyObjectOutput;

import java.io.*;
import java.util.ArrayList;

// 데이터와 입출력(CRUD)을 위해 만들어지며 성공 또는 실패 여부를 반환
public class MemberRepository {

    private ArrayList<Member> membersList = new ArrayList<Member>();//조회해온 내용을 전역으로 관리하기 위해 list컬렉션의 배열형식인 ArrayList를 사용함. File을 사용해서 그럼.

    /*
     * 최초에 생성될 객체의 생성자
     * 1. 초기 회원 3명을 넣어줄 예정(스트림을 활용한 객체 출력)
     * 2. 파일로부터 회원 정보를 가져온다.(스트림을 활용한 객체 입력)
     * 3. ArrayList를 활용해 가져온 회원정보를 저장
     */

    public MemberRepository() {

        File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

        // main을 실행할 때마다 덮어씌우는 문제를 방지하고자 파일이 없을 때만 초기 세팅이 되도록 조건문을 작성
        // .exists() : file의 메소드로, 파일이 있는지 없는지 확인함. 불릴 값을 주는 거 있으면 true,없으면 false 반환함.
        if(! file.exists()) { //.exists()의 동작 >> true : 파일이 있을 때, false : 파일이 없을 때
            // 파일이 해당 경로에 없을 경우이면 새롭게 만들고 추가를 위해 논리 부정함
            ArrayList<Member> members = new ArrayList<>();
            members.add(new Member(1,"user01","pass01",20,new String[] {"발레", "수영"}, BloodType.A));
            members.add(new Member(2,"user02","pass02",10,new String[] {"게임", "만화시청"}, BloodType.AB));
            members.add(new Member(3,"user03","pass03",15,new String[] {"음악감상", "독서", "명상"}, BloodType.O));

            saveMembers(file,members);
        }

        // 파일로부터 회원 객체들을 입력받아 memberList에 쌓기
        loadMember(file);

        // 값 들어왔는지 확인용
//        for(Member member : membersList) {
//            System.out.println("member : " + member);
//        }

    }

    private void loadMember(File file) {
        //ObjectInputStream ois = null; // 읽을거다

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));){

            while (true) {
                membersList.add((Member) ois.readObject()); // 상위인 object라 다운캐스팅 해준것.
            }
        } catch (EOFException e){
            System.out.println("회원 정보 모두 로딩됨....");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }//알아서 close문법을 써서 finally 필요없음.
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     *  멤버 저장 기능용
     * @param file 파일 정보
     * @param members 저장할 멤버 정보
     */
    private void saveMembers(File file, ArrayList<Member> members) {

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file))); // 덮어쓰기

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
        return membersList;
    }

    public Member selectMemberBy(int meberNo) {
//        Member mem = null;
//        for(Member member : membersList) {
//            if(member.getMemberNo() == meberNo) {
//                mem = member;
//            }
//        }
//        return mem;
//    } // 1번 방법, 표현 방법의 차이

        // 2. 축약해서 쓰는 방법
        for(Member member : membersList) {
            if(member.getMemberNo() == meberNo) {
                return member;}
        }
        return null;
    }

    public int insertMember(Member newMember) {
        MyObjectOutput moo = null;

        int result = -1; // 회원 추가 성공 여부

        try {
            moo = new MyObjectOutput(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat",true))); //true: 이어붙이겠다

            // 파일로 새로운 회원 객체 출력(기존 회원에 추가)
            moo.writeObject(newMember);

            // 파일 출력이 성공하면 회원을 관리하는 컬렉션에도 추가(최신화)
            membersList.add(newMember);

            // 객체 한 개 insert 성공을 읨하는 int값
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

    // insert를 하기 위해 회원번호를 발생싴키는데 사용되는 마지막 회원의 번호 추출 기능 메소드
    public int selectLastMemberNo() {
        // 마지막 회원을 조회해서 그 회원의 회원번호를 확인(항상 맞다)
        Member lastMember = membersList.get(membersList.size()-1);
        return lastMember.getMemberNo();

        // 컬렉션의 크기가 곧 회원번호이므로 마지막 회원의 번호는 컬렉션의 크기(항상 맞지는 x)
        //return membersList.size();
    }

    public int updateMember(Member reform) {
        for(int i = 0; i < membersList.size(); i++) {
            Member iMember = membersList.get(i);
            if(iMember.getMemberNo() == reform.getMemberNo()) {
                System.out.println("======= 수정 전 기존 회원 정보와 비교 ======");
                System.out.println("reform: " + reform);
                System.out.println("iMember: " + iMember);
                System.out.println("=========================================");

                membersList.set(i,reform);

                File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");

                if (!file.equals(reform)) return 1; // 주소값에 대한 비교, iMember와 reform의 주소값은 무조건 다름.
            }
        }
        return 0;
    }

    public int deleteMember(int removeMember) {
        /*
         * 현재는 우리가 마지막 회원 번호 추출을 위해 컬렉션의 size()를 활용하고 있다.
         * (그래서 hard delete(실제 회원객체를 제거)를 할 수 없고
         * soft delete(회원 중에 탈퇴와 관련된 속성 수정)를 진행해야 한다.
         *
         * hard delete를 하게된다면 memberList에서 회원 한명을 remove() 메소드를 활용하여 삭제하고
         * 파일 객체 출력을 통해 파일에 컬렉션에 있는 회원들을 다시 덮어씌어야 한다.(ObjectOutputStream을 활용해서)
         */

        // soft delete 시
//        int result = -1;
//
//        for(Member mem : membersList) {
//            if(mem.getMemberNo() == removeMember) {
//                mem.setId(null);
//                return 1;
//            }
//        }
//        return result;

        // hard delete 시
        for(int i = 0; i < membersList.size(); i++) {
            if(membersList.get(i).getMemberNo() == removeMember) {
                membersList.remove(i);

                File file = new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");
                saveMembers(file,membersList);

                return 1;
            }
        }
        return 0;
    }
}
