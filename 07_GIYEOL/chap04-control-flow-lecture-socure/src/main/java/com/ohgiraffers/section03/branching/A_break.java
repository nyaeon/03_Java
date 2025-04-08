package com.ohgiraffers.section03.branching;

public class A_break {
    public static void testSimplebreakstatement() {
    int sum = 0;
    int i =1;
    while(true){ //조건식
        //실행구문
        sum+=i;
        System.out.print("sum ="+ sum);
        if(i==10){
            break; //가장 가까운 반복문을 빠져나감
        }
        i++; //증감식


    }
    }
public static void testJumpbreak() {
        lebel:
        for(;;){
            for(int i =0;i<10;i++){
                System.out.println(i);
            if(i==3){
                break lebel;
            }
            }
        }
    }
        public void testreturnstatement() {
            for (int i = 0; i < 3; i++) {
                if (i == 1) {
                    System.out.println("출력 완료");
                    break;
                }
                System.out.println("for문 출력");
            }
            System.out.println("메소드 끝");
        }
}
