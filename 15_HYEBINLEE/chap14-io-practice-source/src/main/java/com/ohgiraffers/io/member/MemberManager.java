package com.ohgiraffers.io.member;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MemberManager {

  private Member[] members;

  // 1.members.ser 파일읽어서 출력하기
  public void readMembers() {
    String filePath = "src/main/java/com/ohgiraffers/io/member/members.ser";

    ObjectInputStream oin = null;

    try {
      oin = new ObjectInputStream(
          new FileInputStream(filePath));

      while (true) {
        Object obj = oin.readObject();
        members = (Member[]) obj;
      }
    } catch (EOFException e) {
      for (Member member : members) {
        if(member==null)
          break;
        System.out.println(member);
      }
      System.out.println("파일 읽기 끝");
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public void addMember(Member member) {
    String target = "src/main/java/com/ohgiraffers/io/member/members.ser";
    int count;
    for(count = 0; count < members.length; count++) {
      if(members[count]==null)
        break;
    }

    if(count<members.length) {
      members[count]=member;
    }

    try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(target)))){
      oos.writeObject(members);
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
