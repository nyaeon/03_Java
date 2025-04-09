package com.ohgiraffers.io.member;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MemberManager {

    private Member[] members;

    public void readMembers() {
        String filePath = "src/main/java/com/ohgiraffers/io/member/members.ser";
        ObjectInputStream oin = null;

        try {
            oin = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream(filePath)));

            while (true) {
                Object obj = oin.readObject();
                members = (Member[]) obj;
            }

        } catch (EOFException e) {
            for (Member member : members) {
                System.out.println(member);
            }
            System.out.println("파일 읽기끝");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public void addMember(Member member) {
        String filePath = "src/main/java/com/ohgiraffers/io/member/members.ser";
        ObjectOutputStream oot = null;
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                break;
            }
        }

        try {
            oot = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
            oot.writeObject(members);
            oot.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        readMembers();
    }

}
