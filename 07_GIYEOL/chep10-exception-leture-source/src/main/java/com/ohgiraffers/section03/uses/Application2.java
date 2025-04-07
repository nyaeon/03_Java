package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application2 {
    public static void main() {
        /***
         *  try-with-resource
         *  JDK 1.7에서 추가
         *
         *  close 해야하는 인스턴스의 경우 try 옆에 괄호 안에서 생성하면
         *  해당 try - catch 블럭이 완료될 때 자동으로 close 처리 해줌
         *
         */

   try(BufferedReader br = new BufferedReader(new FileReader("test.dat"));){
       String s;
       while  ((s =br.readLine())!= null){
           System.out.println(s);
       }
   }catch(FileNotFoundException | EOFException e){
       System.out.println("파일 끝");
       throw  new RuntimeException(e);
   }catch(IOException e){
       throw  new RuntimeException(e);
   }
    }
}
