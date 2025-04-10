package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {
    private Member[] members;

    public void readMembers() {
        // members.ser 파일을 읽어서 필드에 저장하고, 출력하는 메소드

        String filePath = "chap14-io-practice-source/src/main/java/com/ohgiraffers/io/member/members.ser";
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));

            while (true) {
                Object obj = in.readObject();
                members = (Member[]) obj;
            }

        } catch (EOFException e) {
            System.out.println("파일읽기 끝");
            for (Member member : members) {
                System.out.println(member);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void addMember(Member member) {
//        매개인자를 필드 members에 추가하고, members.ser 파일에 저장하는 메소드
//        객체출력시에는 이어쓰기 없이 Member[]를 덮어쓰기로 처리한다.
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                break;
            }
        }
        String filePath = "chap14-io-practice-source/src/main/java/com/ohgiraffers/io/member/members.ser";
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
            out.writeObject(members);
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
