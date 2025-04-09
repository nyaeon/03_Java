package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManger {
    // 읽어온 사용자정보를 담는용도
    private Member[] members;

    public void readMembers() {
        String filePath = "src/main/java/com/ohgiraffers/io/member/members.ser";
        ObjectInputStream din = null;
        try {
            din = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));

            while(true) {
                //System.out.println(din.readObject());
                members = (Member[]) din.readObject();
            }
        } catch (EOFException e) {
            for(Member member : members) {
                System.out.println(member);
            }
            System.out.println("파일의 끝 확인");
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if (din != null) {
                try {
                    din.close();
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


        // 원래는 10개인데 더 넣고 싶을때
        //Member[] newMembers = new Member[20];
        //System.arraycopy(members, 0, newMembers, 0, members.length);

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(target)))) {
            oos.writeObject(members);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
