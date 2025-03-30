package com.ohgiraffers.section01.conditional.level03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
        *  합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        *  (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
        *  합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
        *  불합격인 경우에는 “불합격입니다.”를 출력하세요.
        *
        *  -- 출력 예시
        *	ex 1.			ex 2.
        *	국어점수 : 88		국어점수 : 88
        *	수학점수 : 50		수학점수 : 50
        *	영어점수 : 40		영어점수 : 45
        *	불합격입니다.		    국어 : 88
        *					    수학 : 50
        *					    영어 : 45
        *					    합계 : 183
        *					    평균 : 61.0
        *				 	    축하합니다, 합격입니다!
        *
        * */

        Scanner sc = new Scanner(System.in);
        List<String> subjectlist = Arrays.asList("국어", "수학", "영어");
        List<Integer> scoreList = new ArrayList<Integer>();
        String msg  = "";
        int sumScore = 0;
        boolean pass = true;
        for (String subject : subjectlist) { // 과목별 점수 저장
            System.out.print(subject + " 점수를 입력하세요 : ");
            int score = sc.nextInt();
            sumScore += score;
            scoreList.add(score);
            msg += (subject + "점수 : " + score + "\n");

            // 40점 미만 불합격처리
            if (score < 40) pass = false;
        }

        // 합격 여부 확인
        double avgScore = (double) sumScore / 3;
        if (pass && avgScore >= 60) {
            for (int i = 0; i < subjectlist.size(); i++) {
                msg += (subjectlist.get(i) + " : " + scoreList.get(i) + "\n");
            }
            msg += ("합계 : " + sumScore + "\n");
            msg += ("평군 : " + avgScore + "\n");
            msg += "축하합니다. 합격입니다!";
        } else {
            msg += "불합격입니다.";
        }

        // 메세지 출력
        System.out.println(msg);
    }
}
