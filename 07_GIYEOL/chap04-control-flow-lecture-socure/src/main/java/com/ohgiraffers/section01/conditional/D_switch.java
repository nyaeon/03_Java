package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public  static void testswitch (){
        Scanner sc = new Scanner(System.in);
        System.out.print("등급을 입력하세여: (G,S,B)");
        char grade =sc.next().charAt(0);
        int point =0;
        boolean flag= true;

        switch (grade){
            case 'G' : point += 11;
            break;
            case 'S' : point += 12;
            break;
            case 'B' : point += 13;
            break;
            default :
                flag = false;
                System.out.println("똑바로 입력하세요 ");

        }
        if(flag){
            System.out.println("당신의 등급은: "+ grade + "현재 포인트는" + point +"이다");
        }
        else{
            System.out.print("회원가입 하세요");
        }
    }
}
