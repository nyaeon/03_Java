package com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatement(){

        int sum = 0;
        int i = 1;

        while (true) {
            // 실행할 구문
            sum += i;
            System.out.println("sum = " + sum);

            if (i == 10){
                break;  // 가장 가까운 반복문을 빠져나간다.
            }
            i++; // 증감식


        }
    }

    public void testJumpBreeak() {

        label:
        for (;;){ //무한 루프
            for (int i = 0; i < 10; i++) {
                System.out.println(i);

                if (i ==3){
                    break label; // label을 사용해서 구문을 멈출 수 있다.
                }

            }
        }
    }

    public void testReturnStatement(){ // 타입 잘보기 void String 등 등..

        for (int i = 0; i < 3; i++){
            if (i == 1){
                System.out.println("출력완료");
                return;
            }
            System.out.println("for문 출력");
        }
        System.out.println("메소드 끝");
    }
}

