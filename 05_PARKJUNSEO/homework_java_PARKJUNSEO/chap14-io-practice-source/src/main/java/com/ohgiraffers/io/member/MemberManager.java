package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {
    private Member[] members;

    // members.ser 파일을 읽어서 필드에 저장하고, 출력하는 메소드
    public void readMembers() {

        ObjectInputStream fis = null;
        Member[] members = new Member[10];

        try {
            fis = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/io/member/members.ser")));

            while (true) {
                Object obj = fis.readObject();
                members = (Member[]) obj;

            }
        } catch (EOFException e) {
            for (Member member : members) {
                System.out.println(member);
            }
            System.out.println("파일 끝");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //매개인자를 필드 members에 추가하고, members.ser 파일에 저장하는 메소드
    //객체출력시에는 이어쓰기 없이 Member[]를 덮어쓰기로 처리한다
    public void addMember(Member mem) {
        int count = 0;
        for (int i = 0; i < members.length; i++) {
            if (members[i] != null) {
                count++;
            }
        }

        if (count < members.length) {
            members[count] = mem;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/io/member/members.ser")))) {
            oos.writeObject(mem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}









