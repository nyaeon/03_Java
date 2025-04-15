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

        String[] sarr = {"홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이시부"};

        String[][] sarr1 = new String[3][2];    // 1분단
        String[][] sarr2 = new String[3][2];    // 2분단

        // 0~5까지 sarr1 인덱스에 대입 후 출력
        // 6~12까지 sarr2 인덱스에 대입 후 출력

        boolean flag = true;
        int count = 0;
        while (count < sarr.length) {
            if (count >= sarr.length / 2 ) { // 1, 2분단 반으로 나누기 boolean 값
                flag = false;
            }

            if (flag) { // 1분단
                for (int j = 0; j < sarr1.length; j++) {
                    for (int k = 0; k < sarr1[j].length ; k++) {
                        sarr1[j][k] = sarr[count];
                        count++;
                    }
                }
            } else {    // 2분단
                for (int j = 0; j < sarr2.length; j++) {
                    for (int k = 0; k < sarr2[j].length ; k++) {
                        sarr2[j][k] = sarr[count];
                        count++;
                    }
                }
            }
        }

        System.out.println("== 1분단 ==");
        for (int i = 0; sarr1.length > i; i++) {
            for (int j = 0; sarr1[i].length > j; j++) {
                System.out.print(sarr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n== 2분단 ==");
        for (int i = 0; sarr2.length > i; i++) {
            for (int j = 0; sarr2[i].length > j; j++) {
                System.out.print(sarr2[i][j] + " ");
            }
            System.out.println();
        }


    }
}
