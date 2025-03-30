package com.ojgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {  //for 문은 반복횟수가 정해져있을때 사용
    public void testSimpleForStatement(){
        // 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문
        for(int i=1 ; i < 11 ; i++){
            System.out.println("i = " + i);
        }
    }

    public void test1(){
        Scanner sc = new Scanner(System.in);
        for(int i=1 ;i <=10 ; i++){
        System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
        String student = sc.nextLine();
        System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");
        }
        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }
    public void test2(){
        int sum = 0;
        for(int i=1; i <= 10 ; i++){
            sum +=i;
        }
     System.out.println("sum = " + sum);
    }
    public void test3(){
        Random random=new Random();
        int sum =0;
        int random1 = random.nextInt(5)+5;
        for(int i=1 ; i <= random1 ; i++){
            sum +=random1;
        }
        System.out.println("sum = " + sum);
    }
}
