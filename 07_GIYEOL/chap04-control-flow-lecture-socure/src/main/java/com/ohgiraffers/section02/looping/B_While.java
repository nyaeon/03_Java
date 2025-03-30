package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_While {
    public void whilestatment(){
        //초기식
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;

        }
    }
    public void whileexample(){
        Scanner sc = new Scanner(System.in);
        char   answer = '\0';
        while(!(answer == 'Y')||(answer == 'y')){
            System.out.print("Y나 y를 누름");
            answer = sc.next().charAt(0);
        }
        System.out.println("누름 확인");
    }
}
