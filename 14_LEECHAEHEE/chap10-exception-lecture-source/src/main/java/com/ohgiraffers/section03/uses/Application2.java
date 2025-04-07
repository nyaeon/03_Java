package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
//        BufferedReader in  = null;
        /*
        * try-with-resource
        * JDK 1.7에 추가된 문법.
        *
        * close해야 하는 인스턴스의 경우 try 옆에 괄호 안에서 생성하면
        * 해당 try-catch 블럭이 완료될 때 자동으로 close처리해준다.
        *
        * */
        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"));){

            String s;

            while((s = in.readLine()) != null) {
                System.out.println(s);
            }

        } catch (FileNotFoundException/* | EOFException*/ e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
