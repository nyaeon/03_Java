package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        /* 문자열 클래스에서 제공하는 length(), charAt() */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String str = sc.nextLine();

        char[] carr = new char[str.length()];
        //System.out.println(carr[0]);

        System.out.print("검색할 문자를 입력하세요 :");
        /* 문자열에서 각 인덱스에 있는 문자를 뽑아내는건 charAt()메소드를 이용 */
        char ch = sc.next().charAt(0);

        /* carr배열에 값을 초기화하기 위한 반복문 */
//		for(int i = 0; i < str.length(); i++) {
//
//			carr[i] = str.charAt(i);
//		}

        /* carr배열안에 들어가 있는 값 확인용 반복문 */
//		for(int i = 0; i < carr.length; i++) {
//			System.out.println(carr[i]);
//		}

        /* toCharArray메소드 이용 가능 */
        char[] carr2 = str.toCharArray();

        /* carr2배열 안에 있는 값을 확인하기 위한 용도의 반복문 */
        for(int i = 0; i < carr2.length; i++) {

            System.out.println(carr2[i]);
        }

        /* 입력한 문자열중에서 찾을려고하는 문자가 몇개 있는지 누적하기 위한 용도의 변수 */
        int count = 0;

        for(int i = 0; i < carr2.length; i++) {

            if(carr2[i] == ch) {
                count++;
            }
        }

        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + ch + "은" + count + "개 입니다.");

    }
}
