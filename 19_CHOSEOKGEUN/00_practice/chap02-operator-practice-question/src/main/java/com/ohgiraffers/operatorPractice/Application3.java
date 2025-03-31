        /*
         * 문자형 변수 하나를 선언하고 변수에 값이 M으로 초기화하면 남자입니다.
         * F이면 여성입니다를 출력하도록 작성하세요 (삼항연산자사용)
         *
         * M
         *
         * ---- 출력 결과 ---
         * 남자입니다.
         * */

package com.ohgiraffers.operatorPractice;

import java.util.Scanner;

public class Application3 {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         char gender;

          while (true) {
              System.out.println("성별을 입력하시오. : 남자: 'M' 'm', 여성 : 'F' 'f'.");
              gender = sc.next().charAt(0); // 성별 입력 받기

              if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
                  break; // 잘못된 입력이 없으면 루프 종료
              } else {
                  System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
              }
          }

          String result = (gender == 'M' || gender == 'm') ? "남자입니다." : "여성입니다.";
          System.out.println(result);

          sc.close();
      }
}
