package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Application4 {

  public static void main(String[] args) {
    // 객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputStream 확인

    MemberDTO[] outputMembers = {
        new MemberDTO("user01", "pass01", "홍길동", "hong345@ohgiraffers.com", 25, '남', 1250.7),
        new MemberDTO("user02", "pass02", "유관순", "korea123@ohgiraffers.com", 16, '여', 1750.7),
        new MemberDTO("user03", "pass03", "이순신", "leesoonsin123@ohgiraffers.com", 35, '남', 3250.7)
    };

    ObjectOutputStream objOut = null;
    // FileOutputStream 인자에 False(아무것도 없음) -> 덮어쓰기
    // 헤더값이 있으면 제외하고, 헤더값이 없으면 ObjectOutputStream으로 새로 헤더 만들어주기
    try {
//      objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
//          "src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt", true)));
      boolean exists = new File(
          "src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt").exists();
      System.out.println("exists: " + exists);

      if (exists) { // 파일이 있는 경우
        objOut = new MyOutputStream(new BufferedOutputStream(new FileOutputStream(
            "src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt", true)));

      } else { // 파일이 없는 경우
        objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
            "src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt", true)));

      }
      for (int i = 0; i < outputMembers.length; i++) {
        objOut.writeObject(outputMembers[i]);
      }
      objOut.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (objOut != null) {
        try {
          objOut.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      System.out.println("==================================");

      MemberDTO[] inputMembers = new MemberDTO[3];

      ObjectInputStream objIn = null;

      try {
        objIn = new ObjectInputStream(
            new BufferedInputStream(
                new FileInputStream(
                    "src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt")));
        while (true) {
          System.out.println(objIn.readObject());
        }
      } catch (EOFException e) {
//        throw new RuntimeException();
      } catch (IOException e) {
        throw new RuntimeException(e);
      } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
      }

    }
  }
}


/* Caused by: java.io.StreamCorruptedException: invalid type code: AC
 *  직렬화된(ObjectOutputStream으로 저장된) 객체 스트림을 ObjectInputStream으로 읽을 때 형식이 깨졌을 때 발생
 *  즉, 읽는 쪽이 객체 스트림이라고 생각했는데, 실제로는 객체 스트림 형식이 아니거나 손상되었을 때 발생합니다.
 *  1. 기존에 있던 파일에 객체를 추가 저장했는데 ObjectOutputStream을 새로 만들면서 헤더(header) 를 또 써버린 경우
 *  2. 헤더가 두개가 생겨서 에러.
 *  3. 객체 스트림이 아닌 데이터를 객체로 읽으려 한 경우
 *  4. 중간에 파일이 손상되었거나, 형식이 맞지 않은 데이터를 섞어 저장한 경우
 *  헤더
 */
