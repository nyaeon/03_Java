package com.ohgiraffers.section03.branching;

public class B_continue {
    public static void testsimplecontinuestatement() {

    for(int i = 1; i <= 100; i++) {
        if (!(i % 4 == 0 && i % 5 == 0)) {
            continue;
        }
        System.out.println(i+"는 4와 5의 공배수");
    }


     /*  if(i%4==0 && i%5==0) {
           System.out.println(i+" 는 4와 5의 공배수");
       }*/
    }
    public void testjumpcontinue() {
        test: // label과 동일
        for(int dan =2 ; dan <10 ; dan++) {

            for(int su =1 ; su <10 ; su++) {
                if(su%2==0){
                    continue test;
                }
                System.out.println(dan+"*"+su+"="+(dan*su));
            }
        System.out.println();
        }

        }
}
