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

        // 배열 생성 및 할당
        String[] students = new String[]{"홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정",
                                         "장보고", "이태백", "김정희", "대조영", "김유신", "이사부"};

        int count = 0;
        String[][] table1 = new String[3][2];
        System.out.println("== 1분단 ==");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                table1[i][j] = students[count++];
                System.out.print(table1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        String[][] table2 = new String[3][2];
        System.out.println("== 2분단 ==");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                table2[i][j] = students[count++];
                System.out.print(table2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
