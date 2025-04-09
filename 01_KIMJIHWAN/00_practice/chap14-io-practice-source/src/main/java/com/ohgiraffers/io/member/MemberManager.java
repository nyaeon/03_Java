package com.ohgiraffers.io.member;

import java.io.*;
import java.lang.reflect.Member;

public class MemberManager {
    private Member[] members;

    public void readMembers() {

        String filePath = "src/main/java/com/ohgiraffers/io/member/members.ser";

        ObjectInputStream oin = null;
        try {
            oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));

            while (true) {
                Object obj = oin.readObject();
                members = (Member[]) obj;
            }

        } catch (EOFException e) {
            for (Member member : members) {
                System.out.println(member);
            }
            System.out.println("파일읽기 끝");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public void addMember(Member members) {

    }

}
