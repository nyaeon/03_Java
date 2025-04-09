package com.ohgiraffers.io.member;

import java.io.*;


public class MemberManager {

    private Object members;

    public  static void main(String[] args) {

        final String filePath = "src/main/java/com/ohgiraffers/io/member/members.ser";
        Member[] members;

        ObjectInputStream oin = null;
        try {
            oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));
            members = (Member[])oin.readObject();
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

    public void readMembers() {
        if(members.lengh == 0){
            return;
        }
    }

    public void addMember(Member newMember) {
    }
}