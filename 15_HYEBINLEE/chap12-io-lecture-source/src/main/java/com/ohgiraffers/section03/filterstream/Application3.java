package com.ohgiraffers.section03.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

  public static void main(String[] args) {
    DataOutputStream dout = null;

    {
      try {
        dout = new DataOutputStream(
            new FileOutputStream(
                ("src/main/java/com/ohgiraffers/section03/filterstream/score.txt")));
        dout.writeUTF("홍길동");
        dout.writeInt(95);
        dout.writeChar('A');
        dout.writeUTF("이순신");
        dout.writeInt(85);
        dout.writeChar('B');
        dout.writeUTF("김철수");
        dout.writeInt(78);
        dout.writeChar('C');
      } catch (IOException e) {
        throw new RuntimeException(e);
      } finally {
        if (dout != null) {
          try {
            dout.close();
          } catch (IOException e) {
            throw new RuntimeException(e);
          }
        }
      }
    }

    System.out.println("-------------------");
    DataInputStream din = null;
    try {
      din = new DataInputStream(
          new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));
      while (true) {
        // 파일에 기록한 순서대로 읽어들어야한다.
        System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
      }
    } catch (EOFException e) {
      System.out.println("파일 읽기 완료");
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (din != null) {
        try {
          din.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}

// EOFException ? : End Of File Exception
