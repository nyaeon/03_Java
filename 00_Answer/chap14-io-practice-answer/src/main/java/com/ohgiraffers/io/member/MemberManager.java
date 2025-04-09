package com.ohgiraffers.io.member;

import java.io.*;
import java.util.List;

public class MemberManager {
    
    private Member[] members;
    
    public void readMembers() {
        
        String filePath = "src/main/java/com/ohgiraffers/io/member/members.ser";
        
        ObjectInputStream oin = null;

        try {
            oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));
//            while (true){
//                System.out.println(oin.readObject());
//            }
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
        } finally {
            if (oin != null) {
                try {
                    oin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void addMember(Member member) {
        String target = "src/main/java/com/ohgiraffers/io/member/members.ser";
        int count = 0;
        for(int i = 0; i < members.length; i++) {
            if(members[i] != null) {
                count++;
            }
        }

        if(count < members.length) {
            members[count] = member;
        }


        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(target)))){
            oos.writeObject(members);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
