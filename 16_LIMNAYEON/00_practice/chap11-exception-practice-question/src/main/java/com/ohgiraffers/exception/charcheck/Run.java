package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {


    public void test1(){

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");

        try {
            String s = sc.nextLine();
            CharacterProcess cp = new CharacterProcess();
            System.out.println(cp.countAlpha(s));
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }

//        try{
//            int result = cp.countAlpha(s);
//            System.out.println("영문자는 총 " + result + "개 입니다.");
//        } catch (CharCheckException e){
//            System.out.println( e.getMessage());
//        }

    }

    public static void main(String[] args) {
        new Run().test1();
    }
}
