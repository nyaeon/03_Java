package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {

    public static void main(String[] args) {

        // 객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputStream 확인

        // 3명의 사용자 입력을 위한 배열 생성
        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong345@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "korea123@ohgiraffers.com", 16, '여', 1750.7),
                new MemberDTO("user03", "pass03", "이순신", "leesoonsin123@ohgiraffers.com", 35, '남', 3250.7)
        };

        ObjectOutputStream objOut = null;

        try {
//            objOut = new ObjectOutputStream(new BufferedOutputStream(
//                    new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testobjStream.txt", true)));

            boolean exists = new File("src/main/java/com/ohgiraffers/section03/filterstream/testobjStream.txt").exists();
            System.out.println("exists: " + exists);

            if(exists) {
                // 파일이 있을 경우
                objOut = new MyOutputStream(new BufferedOutputStream(
                        new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testobjStream.txt", true)));
            } else {
                // 파일이 없을 경우
                objOut = new ObjectOutputStream(new BufferedOutputStream(
                        new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testobjStream.txt", true)));
            }


            for (int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }

            objOut.flush(); // 해당 내용 내보내기

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
        }

        System.out.println("========================================================================================================");

        MemberDTO[] inputMembers = new MemberDTO[3];

        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testobjStream.txt")));

            while (true) {
                System.out.println(objIn.readObject());
            }
        } catch(EOFException e) {
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
            }
        }
    }
}
