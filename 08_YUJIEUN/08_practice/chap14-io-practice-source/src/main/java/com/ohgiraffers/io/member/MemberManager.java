package com.ohgiraffers.io.member;

import java.io.*;


public class MemberManager {
    // 홍길동, 유지은, 이석진, asdf, null,  null,  null, ...
    private Member[] members;

    public void readMembers() {
        final String filePath = "src/main/java/com/ohgiraffers/io/member/members.ser";


        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("저장된 회원 목록이 없습니다.");
            return;
        }


        ObjectInputStream oin = null;
        try {
            oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));
            members = (Member[])oin.readObject();


            // members의 크기는 10
            // 이 중 몇 개는 객체가 있고, 나머지는 null임
        } catch (EOFException e) {
            for (Member member : members) {
                System.out.println(member);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            members = new Member[0];
        } finally {
            if(oin != null) {
                try {
                    oin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void addMember(Member newMember) throws IllegalAccessException {
        // members에서 첫번째 요소부터 확인하면서
        // 빈 공간 (null인 부분)에 새 member를 삽입
//        // (만약 빈 공간이 없으면 예외 던지기)
//      int emptyIndex = findFistEmptyIndex();
//        if(emptyIndex == -1) {
//            throw new IllegalAccessException();
//    }




        for(int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = newMember;
                break;
            }
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/io/member/members.ser")));
            oos.writeObject(members);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}