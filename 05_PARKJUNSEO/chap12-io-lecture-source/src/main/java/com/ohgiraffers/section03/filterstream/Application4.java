package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {

    public static void main(String[] args) {

        // 객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputSteam 확인
        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong345@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "korea123@ohgiraffers.com", 16, '여', 1750.7),
                new MemberDTO("user03", "pass03", "이순신", "leesoonsin123@ohgiraffers.com", 35, '남', 3250.7)
        };

        ObjectOutputStream objout = null;

        /*
        * ObjectOutputStream은 헤더를 만드는데, 이어쓰기 시 문제가 발생함.
        * */
        try {
//            objout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt", true)));

            boolean exists = new File("src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt").exists();
            System.out.println("exists = " + exists);

            if (exists) {    // 이렇게 클래스를 상속하여 재정의한 후 (MyObjectStream) 파일이 있을 경우, 없을 경우에 따라 헤더 정보를 넣게 할지 안할지 결정하기
                // 파일이 있을 경우
                objout = new MyOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt", true)));
            } else {
                // 파일이 없을 경우
                objout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt", true)));
            }   // 이런 방식으로 이어쓰기 잘 하기

            for (int i = 0; i < outputMembers.length; i++) {
                objout.writeObject(outputMembers[i]);
            }
            objout.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (objout != null) {
                try {
                    objout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("===================================================================");

        MemberDTO[] inputMembers = new MemberDTO[outputMembers.length];

        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt")));

            while (true) {
                System.out.println(objIn.readObject());
            }
        } catch (EOFException e) {
            System.out.println("끝");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };

        }
    }
}
