package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatent() {

        for(int i = 1; i <= 100; i++) {

//            if(i % 4 == 0 && i % 5 == 0) {
//                System.out.println(i + "는 4와 5의 공배수");
//            }
            // continue를 활용한 구문으로 변환
            if(!(i % 4 == 0 && i % 5 == 0)) {
                continue;
            }
            System.out.println(i + "는 4화 5의 공배수");
        }

    }


    public void testjumpContinue() {
        test:
        for(int dan = 2; dan < 10; dan++) {
            for(int su = 1; su < 10; su++) {

                if(su % 2 == 0) {
                    continue test;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void testReturnStatement(String str) {

        for (int i = 0; i < 3; i++) {
            if(i == 1) {
                System.out.println("출력완료");
                break;
            }
            System.out.println("for문출력");
        }
        System.out.println(("메소드 끝"));
    }
}
