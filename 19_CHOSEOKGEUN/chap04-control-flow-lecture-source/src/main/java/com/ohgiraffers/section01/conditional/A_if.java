<<<<<<< HEAD
<<<<<<< HEAD
package com.ohgiraffers.section01.conditional;
=======
 package com.ohgiraffers.section01.conditional;
>>>>>>> 3cfb28b (수정2)
=======
package com.ohgiraffers.section01.conditional;
>>>>>>> cec8712 (왜 안돼~~)

import java.util.Scanner;

public class A_if {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cec8712 (왜 안돼~~)

    /***
     * 단일 if문 테스트
     */
    public void testSimpleIfStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 한 개를 입력하세요: ");
        int input = sc.nextInt();

        // 만약에(입력받은 값이 짝수면){
        //   "짝수입니다"라고 출력한다.
        // }
        if(input % 2 == 0) {
            System.out.println("짝수입니다.");
        }
    }

    public void testNestedIfStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.print("양수 하나를 입력해 주세요 : ");
        int input = sc.nextInt();
//        if(input > 0) {
//            if(input % 2 != 0) {
//                System.out.println("입력받은 값은 양수이면서 홀수입니다.");
//            }
//        }

        if(input > 0 && input % 2 != 0) {
            System.out.println("입력받은 값은 양수이면서 홀수입니다.");
        }
    }


}
<<<<<<< HEAD
=======
        public void testSimpleIfStatement() {

            Scanner sc = new Scanner(System.in);

            System.out.print("정수 한 개를 입력하세요: ");
            int input = sc.nextInt();

            // (만약에 입력받은 값이 짝수면) {
            //  " 짝수입니다"라고 출력한다.
            // }

            if(input % 2 ==0) {
                System.out.println("짝수입니다.");
            }
        }

    }

>>>>>>> 3cfb28b (수정2)
=======
>>>>>>> cec8712 (왜 안돼~~)
