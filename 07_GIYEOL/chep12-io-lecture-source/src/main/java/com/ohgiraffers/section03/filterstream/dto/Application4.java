package com.ohgiraffers.section03.filterstream.dto;

import com.ohgiraffers.section03.filterstream.Myoutputstream;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {
        //객체 단위로 입출력하기 위한 Objectinoutstream/Objectoutputstream 확인
        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong345@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "korea123@ohgiraffers.com", 16, '여', 1750.7),
                new MemberDTO("user03", "pass03", "이순신", "leesoonsin123@ohgiraffers.com", 35, '남', 3250.7)
        };
        ObjectOutputStream out = null;
        try {
        //    out = new ObjectOutputStream(new  BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectstream.txt",true)));

            boolean exists = new File("src/main/java/com/ohgiraffers/section03/filterstream/testObjectstream.txt").exists();
            System.out.println("exists : " + exists);
            if(exists) {
                //파일이 있는 경우
                    out = new Myoutputstream(new  BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectstream.txt",true)));

                }else {
                //파일이 없는 경우
                    out = new ObjectOutputStream(new  BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectstream.txt",true)));

                }
            for (int i = 0; i < outputMembers.length; i++) {
                out.writeObject(outputMembers[i]);
            }
            out.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (out != null) {

             try {
                 out.close();
             }catch (IOException e){
             }
                System.out.println("===========================================================");

             MemberDTO[] inputMembers = new MemberDTO[3];

             ObjectInputStream in = null;

                try {
                    in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectstream.txt")));

                   while (true){
                       System.out.println(in.readObject());
                   }

                }catch (EOFException e){
                    System.out.println("끝");

                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }finally {
                    if (in != null) {
                        try{
                            in.close();
                        }catch (IOException e){
                        }
                    }
                }
            }
        }
    }

}
