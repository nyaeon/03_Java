package com.ojgiraffers.section03.branching;

public class A_break {
    public void testSimpleBreakStatement(){
        int sum  = 0 ;
        int i = 1 ; // 초기식

        while(true){ // 조건식
            sum += i ; // 실행할 구문
            System.out.println("sum = " + sum);
            i++; // 증감식
            if(i == 10){
                break; //가장 가까운 반복문을 빠져 나간다
            }
        }
    }

    public void testJumpBreak(){
        label: // break문을 멈추는 용도로 사용
        for (;;){
            for(int i = 0 ; i <= 10 ; i++){
                System.out.println("i = " + i);

                if(i ==3){
                    break label;
                }
            }
        }
    }

    public void testReturnStatement(){
        String test = "hello";
        for( int i = 0 ; i < 3 ; i ++){
            if(i == 1){
                System.out.println("출력완료");
                return;  //return 의 경우 남발하면 잘못된 동작을 일으킬수 있으므로 사용에 주의해야한다
            }
            System.out.println("for문출력");
        }
        System.out.println("메소드 끝");
    }
}
