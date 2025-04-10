package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {
    private Member[] members;
    private String filepath = "src/main/java/com/ohgiraffers/io/member/members.ser";

    public void readMembers() {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filepath)));

            while (true) {
                Object obj = ois.readObject();
                members = (Member[]) obj;
            }

        } catch (EOFException e) {
            for (Member member : members) {
                System.out.println(member);
            }
            System.out.println("끝");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }

    public void addMember(Member member) {

        int count = 0;

        for (int i = 0; i < members.length; i++) {
            if(members[i] != null) {
                count++;
            }
        }

        if (count < members.length) {
            members[count] = member;
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filepath)));

            oos.writeObject(members);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
