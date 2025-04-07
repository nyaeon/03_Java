package com.ogiraffers.section03.uses;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {

        /*
        * try-with-resource
        * JDK 1.7에 추가된 내용임
        *
        * close 해야 하는 인스턴스의 경우  try 옆에 괄호 안에서 생성하면
        * 해당 try-catch 블럭이 완료될 때 자동으로 close 처리해줌
        * */

        try(BufferedReader br = new BufferedReader(new FileReader("test.dat"));) {

            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException | EOFException e) {
            System.out.println("End of file");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
