package com.ohgiraffers.section02.level02.normal;

public class Application2 {

    public static void main(String[] args) {

        /* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
         * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
         * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
         *
         * -- 출석부 --
         * 1. 홍길동
         * 2. 이순신
         * 3. 유관순
         * 4. 윤봉길
         * 5. 장영실
         * 6. 임꺽정
         * 7. 장보고
         * 8. 이태백
         * 9. 김정희
         * 10. 대조영
         * 11. 김유신
         * 12. 이사부
         *
         * -- 출력 예시 --
         * == 1분단 ==
         * 홍길동 이순신
         * 유관순 윤봉길
         * 장영실 임꺽정
         *
         * == 2분단 ==
         * 장보고 이태백
         * 김정희 대조영
         * 김유신 이사부
         */


//        String[] sArr1 = new String[12];
        String[] sArr = {"홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이시부"};
//        for (int i = 1; i < sArr1.length; i++) {
//            sArr1[i] = sArr2[i - 1];
//            System.out.println(i + ". "+ sArr1[i]);
//        }

        String[][] sArr1 = new String[3][2];    // 1분단
        String[][] sArr2 = new String[3][2];    // 2분단




        int a = 0;
        boolean flag = true;

        while(true) {

            if (a < 6) {
                for (int i = 0; i < sArr1.length; i++) {
                    for (int j = 0; j < sArr1[i].length; j++) {
                        System.out.println(sArr1[i][j]);
                        a++;
                    }
                }
            } else {
                for (int i = 0; i < sArr2.length; i++) {
                    for (int j = 0; j < sArr2[i].length; j++) {
                        System.out.println(sArr2[i][j]);
                        a++;
                    }
                }
            }
            if (a >= 6) {
                flag = false;
            }
        }

        for (int i = 0; i < sArr1.length; i++) {
            for (int j = 0; j < sArr1[i].length; j++) {
                System.out.print(sArr1[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sArr2.length; i++) {
            for (int j = 0; j < sArr2[i].length; j++) {
                System.out.print(sArr2[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println("== 1분단 ==");
//        for (int i = 0; i < sArr3.length; i++) {
//            for (int j = 0; j < sArr3[i].length; j++) {
//                System.out.print(sArr3[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//        System.out.println("== 2분단 ==");
//        for (int i = 0; i < sArr4.length; i++) {
//            for (int j = 0; j < sArr4[i].length; j++) {
//                System.out.print(sArr4[i][j] + " ");
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < sArr2.length; i++) {
//            if (sArr3.length <= i + 1) {
//                for (int j = 0; j < sArr3.length; j++) {
//                    sArr3[j][i] = sArr2[i];
//                }
//            } else {
//                for (int j = 0; j < sArr4.length; j++) {
//                    sArr4[j][i] = sArr2[i];
//                }
//            }
//        }
//
//        for (int i = 0; i < sArr3.length; i++) {
//            for (int j = 0; j < sArr3.length; j++) {}
//        }

//            for (int j = 0; j < sArr3[i].length; j++) {
//                sArr3[i][j] = sArr2[j];
//            }
//            for (int j = 0; j < sArr4[i].length; j++) {
//                sArr4[i][j] =
//            }


    }
}
