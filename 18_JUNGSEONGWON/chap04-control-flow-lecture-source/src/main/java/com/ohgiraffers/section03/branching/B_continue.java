package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement(){

        for(int i = 1; i <= 100; i++){

            // if (i % 4 == 0 && i % 5 ==0){
           //   System.out.println(i + "는 4와 5의 공배수입니다.");
          //  }
         // continue를 활용한 구문으로 변환
            if (!(i % 4 == 0 && i % 5 ==0)){
                continue;
            }
            System.out.println(i + "는 4와 5의 공배수입니다.");
        }

    }
    public void testJumpContinue(){
        label:
        for(int dan = 2; dan < 10;dan++){

            for (int su = 1; su < 10; su++){
                if (su % 2 == 0){ // 2의 공배수를 거름.
                    continue label; // label로 작성하든 test로 작성하든 상관 없다.
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }
}
