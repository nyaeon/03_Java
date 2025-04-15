package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args){

        BufferedReader in = null;
        // in을 전역변수로 선언해준 이유는 finally에서도 in 변수를 사용해야 되기 때문에
        // try 문에서 BufferedReader in  = ~ 을 해주면 안된다.

        try {
            in = new BufferedReader(new FileReader("test.dat"));

            String s;

            while((s = in.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

            try {
                if(in != null){
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
