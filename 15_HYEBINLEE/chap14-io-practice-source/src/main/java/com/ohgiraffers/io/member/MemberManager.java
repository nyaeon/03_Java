package com.ohgiraffers.io.member;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MemberMangager {

  ObjectInputStream ois = null;
  ois = new ObjectInputStream(new FileInputStream("src/main/java/com/ohgiraffers/io/member/members.ser"));
}
