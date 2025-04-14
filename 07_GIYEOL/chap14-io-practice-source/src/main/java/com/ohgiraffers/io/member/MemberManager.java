package com.ohgiraffers.io.member;


import java.io.*;

public class MemberManager {
    private Member[] members;

    public void readMembers(){
        ObjectInputStream out = null;
        try{
            out = new ObjectInputStream( new BufferedInputStream( new FileInputStream("src/main/java/com/ohgiraffers/io/member/members.ser") ) );
        while (true){
            Object obj = out.readObject();
            members = (Member[]) obj;
        }
        }catch (EOFException e){
            for(Member member :members){
                System.out.println(member);
            }
            System.out.println("끝");
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);

        }
    }
}
